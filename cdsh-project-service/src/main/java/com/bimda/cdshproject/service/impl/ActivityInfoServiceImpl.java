package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.ActivityInfoMapper;
import com.bimda.cdshproject.pojo.ActivityInfo;
import com.bimda.cdshproject.service.IActivityInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * activity_info 活动信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("activityInfoService")
public class ActivityInfoServiceImpl extends ServiceImpl<ActivityInfoMapper, ActivityInfo> implements IActivityInfoService {

}
