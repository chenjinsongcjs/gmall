package com.xyz.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.gmall.common.utils.PageUtils;
import com.xyz.gmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author éè¿æ¾
 * @email 13887096914@163.com
 * @date 2021-08-26 23:49:25
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

