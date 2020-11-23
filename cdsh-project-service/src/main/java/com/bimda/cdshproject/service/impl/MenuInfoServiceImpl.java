package com.bimda.cdshproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bimda.cdshproject.mapper.MenuInfoMapper;
import com.bimda.cdshproject.pojo.MenuInfo;
import com.bimda.cdshproject.service.IMenuInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * menu_info 权限信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-23
 */
@Service("menuInfoService")
public class MenuInfoServiceImpl extends ServiceImpl<MenuInfoMapper, MenuInfo> implements IMenuInfoService {

}
