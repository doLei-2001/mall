package com.dol.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ¶©µ¥ÅäÖÃÐÅÏ¢
 * 
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 18:36:30
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÃëÉ±¶©µ¥³¬Ê±¹Ø±ÕÊ±¼ä(·Ö)
	 */
	private Integer flashOrderOvertime;
	/**
	 * Õý³£¶©µ¥³¬Ê±Ê±¼ä(·Ö)
	 */
	private Integer normalOrderOvertime;
	/**
	 * ·¢»õºó×Ô¶¯È·ÈÏÊÕ»õÊ±¼ä£¨Ìì£©
	 */
	private Integer confirmOvertime;
	/**
	 * ×Ô¶¯Íê³É½»Ò×Ê±¼ä£¬²»ÄÜÉêÇëÍË»õ£¨Ìì£©
	 */
	private Integer finishOvertime;
	/**
	 * ¶©µ¥Íê³Éºó×Ô¶¯ºÃÆÀÊ±¼ä£¨Ìì£©
	 */
	private Integer commentOvertime;
	/**
	 * »áÔ±µÈ¼¶¡¾0-²»ÏÞ»áÔ±µÈ¼¶£¬È«²¿Í¨ÓÃ£»ÆäËû-¶ÔÓ¦µÄÆäËû»áÔ±µÈ¼¶¡¿
	 */
	private Integer memberLevel;

}
