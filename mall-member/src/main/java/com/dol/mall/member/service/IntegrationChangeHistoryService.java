package com.dol.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dol.common.utils.PageUtils;
import com.dol.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * »ý·Ö±ä»¯ÀúÊ·¼ÇÂ¼
 *
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 18:24:41
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

