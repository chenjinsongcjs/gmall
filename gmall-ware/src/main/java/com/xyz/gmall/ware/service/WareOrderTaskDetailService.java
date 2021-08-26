package com.xyz.gmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.gmall.common.utils.PageUtils;
import com.xyz.gmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author éè¿æ¾
 * @email 13887096914@163.com
 * @date 2021-08-26 23:58:33
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

