package com.cdshproject.service.impl;

import bimda.cdshproject.mapper.BusinessCardMapper;
import bimda.cdshproject.pojo.BusinessCard;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdshproject.service.IBusinessCardService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * business_card 电子名片 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-11
 */
@Service
public class BusinessCardServiceImpl extends ServiceImpl<BusinessCardMapper, BusinessCard> implements IBusinessCardService {

}
