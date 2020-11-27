package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.*;
import com.bimda.cdshproject.pojo.*;
import com.bimda.cdshproject.pojo.bo.UserBO;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.service.IAddUserService;
import com.bimda.cdshproject.service.exception.ApiException;
import com.bimda.cdshproject.utils.TimeStampUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: AddUserServiceImpl
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 17:14
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Transactional(rollbackFor=Exception.class)
@Service("addUserService")
public class AddUserServiceImpl implements IAddUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserContactInfoMapper contactListMapper;

    @Autowired
    private PhyAddressInfoMapper phyAddressInfoMapper;

    @Autowired
    private TelAddressInfoMapper telAddressInfoMapper;

    @Autowired
    private NetAddressInfoMapper netAddressInfoMapper;

    /**
     * 添加用户
     * @param bo
     * @return
     */
    @Override
    public ContactInfoVO addUser(UserBO bo) {
        try {
            //设置用户编号
            String userId = "SH" + TimeStampUtil.getCurrentTimeMillisName();
            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(bo, userInfo);
            userInfo.setUserId(userId);
            //添加用户信息]'[
            userInfoMapper.insert(userInfo);
            //设置用户编号以及通讯录编号
            UserContactInfo contactInfo = new UserContactInfo();
            BeanUtils.copyProperties(bo, contactInfo);
            contactInfo.setUserId(userId);
            //添加通讯录信息
            contactListMapper.insert(contactInfo);
            //插入地址信息
            addressInsert(bo, userId);
            //设置返回对象
            ContactInfoVO vo = new ContactInfoVO();
            bo.setUserId(userId);
            BeanUtils.copyProperties(bo, vo);
            return vo;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
    /**
     * 插入地址信息
     * @param bo
     * @param userId
     */
    public void addressInsert(UserBO bo, String userId){
        //设置地址
        if(bo.getCompanyAddress() != null || !bo.getCompanyAddress().equals("")){
            PhyAddressInfo address = new PhyAddressInfo();
            address.setAddressId("DZ" + TimeStampUtil.getCurrentTimeMillisName());
            address.setAddressArea(bo.getCompanyArea());
            address.setAddressContent(bo.getCompanyAddress());
            address.setUserId(userId);
            address.setContantType("0021101");
            address.setCreateTime(new Date());
            phyAddressInfoMapper.insert(address);
        }
        //设置联系电话
        if(bo.getUserTel() != null || !bo.getUserTel().equals("")){
            TelAddressInfo userTel = new TelAddressInfo();
            userTel.setAddressId("SJ" + TimeStampUtil.getCurrentTimeMillisName());
            userTel.setAddressTel(bo.getUserTel());
            userTel.setContantType("0022101");
            userTel.setCreateTime(new Date());
            userTel.setUserId(userId);
            telAddressInfoMapper.insert(userTel);
        }
        //设置固话
        if(bo.getUserFixedTel() != null || !bo.getUserFixedTel().equals("")){
            TelAddressInfo userFixedTel = new TelAddressInfo();
            userFixedTel.setAddressId("GH" + TimeStampUtil.getCurrentTimeMillisName());
            userFixedTel.setAddressTel(bo.getUserFixedTel());
            userFixedTel.setContantType("0022201");
            userFixedTel.setCreateTime(new Date());
            userFixedTel.setUserId(userId);
            telAddressInfoMapper.insert(userFixedTel);
        }
        //设置传真
        if(bo.getUserFax() != null || !bo.getUserFax().equals("")){
            TelAddressInfo userFax = new TelAddressInfo();
            userFax.setAddressId("CZ" + TimeStampUtil.getCurrentTimeMillisName());
            userFax.setAddressTel(bo.getUserFax());
            userFax.setContantType("0022301");
            userFax.setCreateTime(new Date());
            userFax.setUserId(userId);
            telAddressInfoMapper.insert(userFax);
        }
        //设置邮箱
        if(bo.getUserEmail() != null || !bo.getUserEmail().equals("")){
            NetAddressInfo userEmail = new NetAddressInfo();
            userEmail.setAddressId("YX" + TimeStampUtil.getCurrentTimeMillisName());
            userEmail.setAddressContent(bo.getUserEmail());
            userEmail.setContantType("0023101");
            userEmail.setCreateTime(new Date());
            userEmail.setUserId(userId);
            netAddressInfoMapper.insert(userEmail);
        }
        //设置网址
        if(bo.getWebsite() != null || !bo.getWebsite().equals("")){
            NetAddressInfo website = new NetAddressInfo();
            website.setAddressId("WZ" + TimeStampUtil.getCurrentTimeMillisName());
            website.setAddressContent(bo.getWebsite());
            website.setContantType("0023201");
            website.setCreateTime(new Date());
            website.setUserId(userId);
            netAddressInfoMapper.insert(website);
        }
        //设置微信
        if(bo.getUserWechat() != null || !bo.getUserWechat().equals("")){
            NetAddressInfo userWechat = new NetAddressInfo();
            userWechat.setAddressId("WX" + TimeStampUtil.getCurrentTimeMillisName());
            userWechat.setAddressContent(bo.getUserWechat());
            userWechat.setContantType("0023301");
            userWechat.setCreateTime(new Date());
            userWechat.setUserId(userId);
            netAddressInfoMapper.insert(userWechat);
        }
        //设置QQ
        if(bo.getUserQq() != null || !bo.getUserQq().equals("")){
            NetAddressInfo userQq = new NetAddressInfo();
            userQq.setAddressId("QQ" + TimeStampUtil.getCurrentTimeMillisName());
            userQq.setAddressContent(bo.getUserQq());
            userQq.setContantType("0023401");
            userQq.setCreateTime(new Date());
            userQq.setUserId(userId);
            netAddressInfoMapper.insert(userQq);
        }
        //设置阿里旺旺号
        if(bo.getUserAli() != null || !bo.getUserAli().equals("")){
            NetAddressInfo userAli = new NetAddressInfo();
            userAli.setAddressId("AL" + TimeStampUtil.getCurrentTimeMillisName());
            userAli.setAddressContent(bo.getUserAli());
            userAli.setContantType("0023501");
            userAli.setCreateTime(new Date());
            userAli.setUserId(userId);
            netAddressInfoMapper.insert(userAli);
        }
        //设置公司
        if(bo.getCompany() != null || !bo.getCompany().equals("")){
            NetAddressInfo company = new NetAddressInfo();
            company.setAddressId("GS" + TimeStampUtil.getCurrentTimeMillisName());
            company.setAddressContent(bo.getCompany());
            company.setContantType("0023601");
            company.setCreateTime(new Date());
            company.setUserId(userId);
            netAddressInfoMapper.insert(company);
        }
    }
}
