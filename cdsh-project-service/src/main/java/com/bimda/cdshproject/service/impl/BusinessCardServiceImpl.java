package com.bimda.cdshproject.service.impl;

import com.bimda.cdshproject.mapper.BusinessCardMapper;
import com.bimda.cdshproject.pojo.BusinessCard;
import com.bimda.cdshproject.service.IBusinessCardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * business_card 电子名片 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service("businessCardService")
public class BusinessCardServiceImpl extends ServiceImpl<BusinessCardMapper, BusinessCard> implements IBusinessCardService {

}
