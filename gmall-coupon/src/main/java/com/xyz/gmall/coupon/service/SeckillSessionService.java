package com.xyz.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.gmall.common.utils.PageUtils;
import com.xyz.gmall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author éè¿æ¾
 * @email 13887096914@163.com
 * @date 2021-08-26 23:53:44
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

