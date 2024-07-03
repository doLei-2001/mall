package com.dol.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÊôÐÔÖµ
 * 
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 12:39:22
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÉÌÆ·id
	 */
	private Long spuId;
	/**
	 * ÊôÐÔid
	 */
	private Long attrId;
	/**
	 * ÊôÐÔÃû
	 */
	private String attrName;
	/**
	 * ÊôÐÔÖµ
	 */
	private String attrValue;
	/**
	 * Ë³Ðò
	 */
	private Integer attrSort;
	/**
	 * ¿ìËÙÕ¹Ê¾¡¾ÊÇ·ñÕ¹Ê¾ÔÚ½éÉÜÉÏ£»0-·ñ 1-ÊÇ¡¿
	 */
	private Integer quickShow;

}
