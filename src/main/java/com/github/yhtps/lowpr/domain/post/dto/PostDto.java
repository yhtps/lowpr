package com.github.yhtps.lowpr.domain.post.dto;

import com.github.yhtps.lowpr.domain.member.MemberEntity;

import lombok.Data;

@Data
public class PostDto {

	private long no;

	private String title;

	private String content;

	private int viewCount;

	private int likes;

	private int dislikes;

	private MemberEntity member;

}
