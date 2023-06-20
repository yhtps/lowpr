package com.github.yhtps.lowpr.domain.attendance;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.github.yhtps.lowpr.domain.common.BaseEntityBody;
import com.github.yhtps.lowpr.domain.common.enums.AttStatus;
import com.github.yhtps.lowpr.domain.member.MemberEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Attendance")
public class AttendanceEntity extends BaseEntityBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;

	private LocalDate date;

	private LocalTime onTime;

	private LocalTime offTime;

	@Enumerated(EnumType.STRING)
	private AttStatus status;

	@ManyToMany(mappedBy = "attendances")
	private final List<MemberEntity> members = new ArrayList<>();

}
