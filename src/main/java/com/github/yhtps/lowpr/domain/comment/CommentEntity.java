package com.github.yhtps.lowpr.domain.comment;

import java.util.ArrayList;
import java.util.List;

import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.member.MemberEntity;
import com.github.yhtps.lowpr.domain.post.PostEntity;
import com.github.yhtps.lowpr.domain.product.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Comment")
public class CommentEntity extends BaseEntityBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	/**
	 * 댓글(170자 제한)
	 */
	@Column(nullable = false, length = 510)
	private String content;

	@ManyToOne
	private CommentEntity parentComment;

	@OneToMany(mappedBy = "parentComment", cascade = CascadeType.DETACH)
	private List<CommentEntity> childComments = new ArrayList<>();

	@ManyToOne
	private MemberEntity member;

	@ManyToOne
	private PostEntity post;

	/**
	 * 상품가격 짤막한 평가같은거 //대댓글불가
	 */
	@ManyToOne
	private ProductEntity product;

	@Builder
	protected CommentEntity(long no, String content, CommentEntity parentComment, MemberEntity member, PostEntity post,
			ProductEntity product) {
		this.no = no;
		this.content = content;
		this.parentComment = parentComment;
		this.member = member;
		this.post = post;
		this.product = product;
	}

}
