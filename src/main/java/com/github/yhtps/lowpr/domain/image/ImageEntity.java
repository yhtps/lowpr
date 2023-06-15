package com.github.yhtps.lowpr.domain.image;

import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.post.PostEntity;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import jakarta.persistence.Column;
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
@Table(name = "Image")
public class ImageEntity extends BaseEntityBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	private String orgName;

	@Column(unique = true)
	private String newName;

	private String imgPath;

	@ManyToOne
	private PostEntity post;

	@ManyToOne
	private MemberEntity member;

	@ManyToOne
	private ProductEntity product;

}
