package com.github.yhtps.lowpr.domain.comment.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

	private long no;

	private String content;

	private String nickname;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	private boolean hide;

}
