package com.github.yhtps.lowpr.domain.image.dto;

import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.post.PostEntity;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import lombok.Data;

@Data
public class ImageDto {

	private long no;

	private String orgName;

	private String newName;

	private String imgPath;

	private PostEntity post;

	private MemberEntity member;

	private ProductEntity product;

}
