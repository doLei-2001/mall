package com.dol.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dol.mall.product.entity.SkuImagesEntity;
import com.dol.mall.product.service.SkuImagesService;
import com.dol.common.utils.PageUtils;
import com.dol.common.utils.R;



/**
 * skuÍ¼Æ¬
 *
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 12:42:09
 */
@RestController
@RequestMapping("product/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("product:skuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("product:skuimages:info")
    public R info(@PathVariable("id") Long id){
		SkuImagesEntity skuImages = skuImagesService.getById(id);

        return R.ok().put("skuImages", skuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:skuimages:save")
    public R save(@RequestBody SkuImagesEntity skuImages){
		skuImagesService.save(skuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:skuimages:update")
    public R update(@RequestBody SkuImagesEntity skuImages){
		skuImagesService.updateById(skuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("product:skuimages:delete")
    public R delete(@RequestBody Long[] ids){
		skuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
