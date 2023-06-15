package com.github.yhtps.lowpr.domain.member;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.yhtps.lowpr.domain.attendance.AttendanceEntity;
import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.common.enums.MemberRole;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Member")
public class MemberEntity extends BaseEntityBody {

	// TODO 프로필사진, 권한 ,연관관계(product는 중간관리자만 등록가능,가격기록은 회원만 등록가능등...)
	/**
	 * 회원 고유번호
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	/**
	 * 이메일
	 */
	@Column(nullable = false, unique = true)
	private String email;

	/**
	 * 비밀번호
	 */
	@JsonIgnore
	@Column(nullable = false)
	private String password;

	/**
	 * 별명
	 */
	@Column(nullable = false, unique = true)
	private String nickname;

	/**
	 * 이름
	 */
	private String name;

	/**
	 * 전화번호
	 */
	@JsonIgnore
	@Column(length = 11)
	private String telNum;

	/**
	 * 생년월일
	 */
	@JsonIgnore
	private LocalDate birth;

	/**
	 * 성별 1: 남자, 2: 여자, 그외 기타
	 */
	@Column(length = 2)
	private byte gender;

	@Enumerated(EnumType.STRING)
	@CollectionTable(joinColumns = @JoinColumn(name = "memberNo"), name = "LowprRole")
	@ElementCollection(fetch = FetchType.EAGER)
	private final Set<MemberRole> roles = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "AttendanceMember", joinColumns = @JoinColumn(name = "memberNo"), inverseJoinColumns = @JoinColumn(name = "attendanceNo"))
	private final List<AttendanceEntity> attendances = new ArrayList<>();

	@Builder
	protected MemberEntity(long no, String email, String password, String nickname, String name, String telNum, LocalDate birth,
			byte gender) {
		this.no = no;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.telNum = telNum;
		this.birth = birth;
		this.gender = gender;
	}

}
