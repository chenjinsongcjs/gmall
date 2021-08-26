package com.xyz.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyz.gmall.common.utils.PageUtils;
import com.xyz.gmall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author éè¿æ¾
 * @email 13887096914@163.com
 * @date 2021-08-26 23:56:27
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

