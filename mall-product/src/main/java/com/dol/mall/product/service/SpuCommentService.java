package com.dol.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dol.common.utils.PageUtils;
import com.dol.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÆÀ¼Û
 *
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 12:39:22
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

