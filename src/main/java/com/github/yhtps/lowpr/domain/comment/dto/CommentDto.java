package com.github.yhtps.lowpr.domain.comment.dto;

import com.github.yhtps.lowpr.domain.comment.CommentEntity;
import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.post.PostEntity;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import lombok.Data;

@Data
public class CommentDto {

	private long no;

	private String content;

	private CommentEntity parentComment;

	private MemberEntity member;

	private PostEntity post;

	private ProductEntity product;

}
