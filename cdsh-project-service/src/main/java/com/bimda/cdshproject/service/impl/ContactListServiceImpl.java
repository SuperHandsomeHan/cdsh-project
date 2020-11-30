package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bimda.cdshproject.mapper.*;
import com.bimda.cdshproject.pojo.NetAddressInfo;
import com.bimda.cdshproject.pojo.PhyAddressInfo;
import com.bimda.cdshproject.pojo.TelAddressInfo;
import com.bimda.cdshproject.pojo.UserInfo;
import com.bimda.cdshproject.pojo.vo.ContactInfoVO;
import com.bimda.cdshproject.pojo.vo.UserInfoVO;
import com.bimda.cdshproject.service.IContactListService;
import com.bimda.cdshproject.service.exception.ApiException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.impl
 * @NAME: ContactListServiceImpl
 * @USER: Han
 * @DATE: 2020/11/16
 * @TIME: 13:44
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
@Service("contactListService")
public class ContactListServiceImpl implements IContactListService {

    @Autowired
    private ContactListMapper contactListMapper;

    @Autowired
    private NetAddressInfoMapper netAddressInfoMapper;

    @Autowired
    private PhyAddressInfoMapper phyAddressInfoMapper;

    @Autowired
    private TelAddressInfoMapper telAddressInfoMapper;

    /**
     * 根据角色编号查询所有联系人
     * @param roleIds 所有角色编号
     * @return
     */
    @Override
    public List<ContactInfoVO> listContactInfoByRoleId(Integer ... roleIds) {
        try {
            List<UserInfoVO> list = new ArrayList<>();
            if(roleIds ==  null || roleIds.length == 0){
                throw new ApiException("请输入用户类型编号！");
            }
            list = contactListMapper.listContactInfoByRoleId(roleIds);
            List<ContactInfoVO> target = new ArrayList<>();
            if(list != null || list.size() > 0){
                for (UserInfoVO userInfoVO : list){
                    ContactInfoVO contactInfoVO = new ContactInfoVO();
                    BeanUtils.copyProperties(userInfoVO, contactInfoVO);
                    selectUserInfo(contactInfoVO);
                    target.add(contactInfoVO);
                }
            }
            return target;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }

    /**
     * 查询所有联系人
     * @return
     */
    @Override
    public List<ContactInfoVO> listContactInfo() {
        try {
            List<UserInfoVO> list = contactListMapper.listContactInfo();
            List<ContactInfoVO> target = new ArrayList<>();
            if(list != null || list.size() > 0){
                for (UserInfoVO userInfoVO : list){
                    ContactInfoVO contactInfoVO = new ContactInfoVO();
                    BeanUtils.copyProperties(userInfoVO, contactInfoVO);
                    selectUserInfo(contactInfoVO);
                    target.add(contactInfoVO);
                }
            }
            return target;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }

    /**
     * 查询用户地址信息
     * @param vo
     */
    private void selectUserInfo(ContactInfoVO vo){
        //获取地址
        //设置地址类型
        String phyType = "0021101";
        QueryWrapper phyWrapper = new QueryWrapper<>();
        phyWrapper.eq("user_id", vo.getUserId());
        phyWrapper.eq("contant_type", phyType);
        PhyAddressInfo phyAddressInfo = new PhyAddressInfo();
        phyAddressInfo = phyAddressInfoMapper.selectOne(phyWrapper);
        if (phyAddressInfo != null){
            vo.setCompanyArea(phyAddressInfo.getAddressArea());
            vo.setCompanyAddress(phyAddressInfo.getAddressContent());
        }

        //获取电话
        //设置电话类型
        String telType = "0022101";
        QueryWrapper telWrapper = new QueryWrapper<>();
        telWrapper.eq("user_id", vo.getUserId());
        telWrapper.eq("contant_type", telType);
        TelAddressInfo telAddressInfo = new TelAddressInfo();
        telAddressInfo = telAddressInfoMapper.selectOne(telWrapper);
        if(telAddressInfo != null){
            vo.setUserTel(telAddressInfo.getAddressTel());
        }

        //设置固话类型
        telType = "0022201";
        telWrapper = new QueryWrapper();
        telWrapper.eq("user_id", vo.getUserId());
        telWrapper.eq("contant_type", telType);
        telAddressInfo = telAddressInfoMapper.selectOne(telWrapper);
        if(telAddressInfo != null){
            vo.setUserFixedTel(telAddressInfo.getAddressTel());
        }

        //设置传真类型
        telType = "0022301";
        telWrapper = new QueryWrapper();
        telWrapper.eq("user_id", vo.getUserId());
        telWrapper.eq("contant_type", telType);
        telAddressInfo = telAddressInfoMapper.selectOne(telWrapper);
        if(telAddressInfo != null){
            vo.setUserFax(telAddressInfo.getAddressTel());
        }

        //获取互联网
        //设置邮箱类型
        String netType = "0023101";
        QueryWrapper netWrapper = new QueryWrapper<>();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        NetAddressInfo netAddressInfo = new NetAddressInfo();
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setUserEmail(netAddressInfo.getAddressContent());
        }

        //设置网址类型
        netType = "0023201";
        netWrapper = new QueryWrapper();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setWebsite(netAddressInfo.getAddressContent());
        }

        //设置微信类型
        netType = "0023301";
        netWrapper = new QueryWrapper();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setUserWechat(netAddressInfo.getAddressContent());
        }

        //设置QQ类型
        netType = "0023401";
        netWrapper = new QueryWrapper();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setUserQq(netAddressInfo.getAddressContent());
        }

        //设置阿里巴巴号类型
        netType = "0023501";
        netWrapper = new QueryWrapper();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setUserAli(netAddressInfo.getAddressContent());
        }

        //设置公司类型
        netType = "0023601";
        netWrapper = new QueryWrapper();
        netWrapper.eq("user_id", vo.getUserId());
        netWrapper.eq("contant_type", netType);
        netAddressInfo = netAddressInfoMapper.selectOne(netWrapper);
        if(netAddressInfo != null){
            vo.setCompany(netAddressInfo.getAddressContent());
        }
    }

    /**
     * 根据条件查询所有联系人
     * @param condition 条件
     * @param roleIds 角色编号
     * @return
     */
    @Override
    public List<ContactInfoVO> listContactInfoByCondition(String condition, Integer[] roleIds) {
        try {
            List<UserInfoVO> list = new ArrayList<>();
            if(roleIds ==  null || roleIds.length == 0){
                throw new ApiException("请输入用户类型编号！");
            }
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.like("user_position", condition);
            wrapper.or();
            wrapper.like("user_name", condition);
            list = contactListMapper.listContactInfoByRoleIdAndCondition(condition, roleIds);
            List<ContactInfoVO> target = new ArrayList<>();
            if(list != null || list.size() > 0){
                for (UserInfoVO userInfoVO : list){
                    ContactInfoVO contactInfoVO = new ContactInfoVO();
                    BeanUtils.copyProperties(userInfoVO, contactInfoVO);
                    selectUserInfo(contactInfoVO);
                    target.add(contactInfoVO);
                }
            }
            return target;
        }catch (Exception e){
            throw new ApiException(e);
        }
    }
}
