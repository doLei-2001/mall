package com.dol.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dol.mall.product.entity.BrandEntity;
import com.dol.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    // 测试
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> brandId = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));

        brandId.forEach(item -> System.out.println(item));

        System.out.println("hel111111111111111");
    }

}
