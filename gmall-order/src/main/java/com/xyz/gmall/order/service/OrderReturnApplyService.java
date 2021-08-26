package com.xyz.gmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.gmall.common.utils.PageUtils;
import com.xyz.gmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author éè¿æ¾
 * @email 13887096914@163.com
 * @date 2021-08-26 23:49:24
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

