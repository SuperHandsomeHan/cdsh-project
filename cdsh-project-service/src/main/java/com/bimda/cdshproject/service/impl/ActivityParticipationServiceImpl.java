package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.ActivityParticipationMapper;
import com.bimda.cdshproject.pojo.ActivityParticipation;
import com.bimda.cdshproject.service.IActivityParticipationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * activity_participation 活动报名表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("activityParticipationService")
public class ActivityParticipationServiceImpl extends ServiceImpl<ActivityParticipationMapper, ActivityParticipation> implements IActivityParticipationService {

}
