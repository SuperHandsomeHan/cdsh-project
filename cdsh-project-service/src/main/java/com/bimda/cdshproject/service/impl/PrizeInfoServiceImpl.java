package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.PrizeInfoMapper;
import com.bimda.cdshproject.pojo.PrizeInfo;
import com.bimda.cdshproject.service.IPrizeInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * prize_info 活动奖品信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("prizeInfoService")
public class PrizeInfoServiceImpl extends ServiceImpl<PrizeInfoMapper, PrizeInfo> implements IPrizeInfoService {

}
