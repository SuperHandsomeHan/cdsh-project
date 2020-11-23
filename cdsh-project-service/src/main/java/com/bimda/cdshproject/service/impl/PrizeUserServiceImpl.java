package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.PrizeUserMapper;
import com.bimda.cdshproject.pojo.PrizeUser;
import com.bimda.cdshproject.service.IPrizeUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * prize_user 获奖用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("prizeUserService")
public class PrizeUserServiceImpl extends ServiceImpl<PrizeUserMapper, PrizeUser> implements IPrizeUserService {

}
