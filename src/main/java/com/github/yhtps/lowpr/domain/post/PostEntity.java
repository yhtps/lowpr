package com.github.yhtps.lowpr.domain.post;

import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.member.MemberEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Post")
public class PostEntity extends BaseEntityBody {
	// TODO 프로필사진

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	private String title;

	private String content;

	private int viewCount;

	private int likes;

	private int dislikes;

	@ManyToOne
	private MemberEntity member;

}
