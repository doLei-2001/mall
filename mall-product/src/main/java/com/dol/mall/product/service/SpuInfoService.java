package com.dol.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dol.common.utils.PageUtils;
import com.dol.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spuÐÅÏ¢
 *
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 12:39:22
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

