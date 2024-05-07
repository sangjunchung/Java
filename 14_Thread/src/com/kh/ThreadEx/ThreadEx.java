package com.kh.ThreadEx;

/*
process : program + success = 프로그램 실행 성공 -> 프로그램 실행중
Thread(스레드) : 실
스레드는 컴퓨터에서 실제로 작업을 수행하는 것을 의미

두 개 이상의 스레드를 가지는 프로세스를 멀티스레드라고 함

스레드르 생성하는 방법
1. Runnable 인터페이스 사용

2. Thread 클래스 상속받기
	메서드와 관계없이 스레드를 시작할 때는 start() 를 사용해야지 시작할 수 있음
	스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작되는 지점에 따라 달라짐

스레드는 기본으로 우선순위가 5
우선순위는 1 ~ 10 까지 존재 높을수록 우선도가 높아지며 높은 우선순위일수록 더 많은 실행시간을 할당받음
Thread.MIN_PRIORITY = 우선순위 1
Thread.NORM_PRIORITY = 우선순위 5 (기본)
Thread.MAX_PRIORITY = 우선순위 10 

만약에 우선순위에서 1 5 10 이외의 우선순위를 사용하고 싶을 때
setPriority(원하는 우선순위 숫자)

스레드에서 말하는 우선순위는 CPU 자원을 더 많이 확보하는 우선순위
우선순위가 높다고 항상 낮은 우선순위보다 먼저 실행되지 않음

sleep() : ~초 간 잠자는 상태 유지(시간이 끝나면 알아서 시작함)

-Lock(락) 거는건(아래 두 메서드) 위험하여 사용하는 것을 권장하지 않음
suspend() : 일시 중지(resume으로 다시 시작하기 전까지 상태 유지)
resume() : 일시 중지한 스레드 다시 시작

아래 두 메서드는 보통 세트로 쓰임
wait() : 특정 조건이 충족될 때까지 대기
notify() : 대기 중인 스레드를 깨워 특정 작업을 진행하도록 함

아래 두 메서드는 보통 세트로 쓰임
await() : condition 에 속한 스레드를 일시적으로 대기 상태로 만듬 
signal() : await에 의해 대기하고 있는 스레드를 깨움

*/

public class ThreadEx extends Thread {

	@Override
	public void run() {
		System.out.println("스레드 실행 중");
		
		try {
			Thread.sleep(1000);
			
			System.out.println("1초 끝!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
