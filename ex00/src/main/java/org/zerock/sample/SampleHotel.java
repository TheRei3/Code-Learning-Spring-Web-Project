package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
// @AllArgsConstructor <- 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자로 작성
@RequiredArgsConstructor  // 특정한 변수에 대해서 생성자를 작성할 때
public class SampleHotel {
	
	@NonNull  // 특정한 변수 지정
	private Chef chef;
	
	/*
	public SampleHotel(Chef chef) {
		
		this.chef = chef;
		
	}
	*/
}
