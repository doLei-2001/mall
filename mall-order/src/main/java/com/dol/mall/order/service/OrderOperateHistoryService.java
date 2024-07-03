package com.dol.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dol.common.utils.PageUtils;
import com.dol.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * ¶©µ¥²Ù×÷ÀúÊ·¼ÇÂ¼
 *
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 18:36:30
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

