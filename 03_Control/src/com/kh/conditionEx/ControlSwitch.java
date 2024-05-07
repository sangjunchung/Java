package com.kh.conditionEx;

public class ControlSwitch {

	/*
	switch / case 
	if문과 비슷하지만 형식이 일정하게 있는 조건 판단문
	break; case를 빠져나가기 위한 제어장치(만약 break문이 없으면 다음 케이스를 실행함)
	case에 관련된 결과를 실행하기전 break 호출시 에러 발생함.
	
	여러개의 case 가 동일한 결과를 갖길 원한다면 case를 이어서 작성할 수 있음
	case 1: case 2: case 3: 
		System.out.print("동일한 값 출력");
		
	break 와 return
	break - switch, for, while 문에서 사용 해당하는 블록을 벗어남
	return - 어디서든지 사용가능
			값을 반환할 수 있고, 메서드나 함수의 실행을 중단하고 호출한 곳으로 값을 전달
			메서드나 함수 내에서 return 문이 실행되면 그 이후의 코드는 실행하지 않음
	*/
	public static void main(String[] args) {
		
		int day = 3;
		String dayString;
		
		switch(day) {
			case 1:
				dayString = "일요일";
				break;
			case 2:
				dayString = "월요일";
				break;
			case 3:
				dayString = "화요일";
				break;
			case 4:
				dayString = "수요일";
				break;
			default : 
				dayString = "잘못된 입력입니다.";
		}
		
		System.out.println("입력한 숫자는 "+dayString+"입니다.");
	}
}
