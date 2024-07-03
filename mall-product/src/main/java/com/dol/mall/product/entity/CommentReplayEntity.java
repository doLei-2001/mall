package com.dol.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·ÆÀ¼Û»Ø¸´¹ØÏµ
 * 
 * @author dol
 * @email doLei2001@163.com
 * @date 2024-07-03 12:39:22
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÆÀÂÛid
	 */
	private Long commentId;
	/**
	 * »Ø¸´id
	 */
	private Long replyId;

}
