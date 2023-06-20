package com.github.yhtps.lowpr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LowprApplicationTests {

	private String koreanName() {
		final List<String> familyName = Arrays.asList("강", "고", "곽", "권", "구", "김", "나", "남", "남궁", "노", "독", "독고", "동방", "도", "란",
				"류", "문", "민", "박", "반", "백", "배", "방", "백", "복", "봉", "사공", "사마", "서", "서문", "선", "선우", "설", "성", "손", "송", "신", "심",
				"안", "양", "엄", "여", "오", "우", "원", "유", "윤", "은", "이", "임", "장", "전", "정", "조", "주", "지", "진", "차", "천", "최", "추", "탁",
				"태", "하", "한", "허", "현", "형", "홍", "황", "황보", "회", "효");
		final List<String> names = Arrays.asList("가", "경", "건", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다", "단",
				"달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박", "백", "범", "별",
				"병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순", "숭", "슬", "승", "시", "신",
				"아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이",
				"익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초",
				"춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운",
				"모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱",
				"휴", "언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손",
				"술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀",
				"향", "울", "련");
		Collections.shuffle(familyName);
		Collections.shuffle(names);
		StringBuilder fullName = new StringBuilder(familyName.get(0));
		int nameLength = (Math.random() < 0.9) ? 2 : (int) (Math.random() * 4) + 1;
		fullName.append(String.join("", names.subList(0, nameLength)));
		return fullName.toString();
	}

	public String krPhone() {
		final List<String> pNum = Arrays.asList("010", "011", "012", "013");
		Collections.shuffle(pNum);
		return pNum.get(0);
	}

	public String phoneNum() {
		return (int) (Math.random() * 8999) + 1000 + "";
	}

	@Test
	void contextLoads() {
		System.out.println(koreanName());
		System.out.println(koreanName());
		System.out.println(koreanName());
		System.out.println(koreanName());
		System.out.println(koreanName());
	}

}
