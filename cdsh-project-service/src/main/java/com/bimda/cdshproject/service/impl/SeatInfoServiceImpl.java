package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.SeatInfoMapper;
import com.bimda.cdshproject.pojo.SeatInfo;
import com.bimda.cdshproject.service.ISeatInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * activity_info 座位信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("seatInfoService")
public class SeatInfoServiceImpl extends ServiceImpl<SeatInfoMapper, SeatInfo> implements ISeatInfoService {

}
