package com.kh.variable.pre;

public class EnumPre {

	public enum rainbow {
		빨, 주, 노, 초, 파, 남, 보
	}

	public enum season {
		봄, 여름, 가을, 겨울
	}

	public enum consumer {
		학생, 직장인, 연장자
	}

	public enum seller {
		소매업, 중매업, 도매업
	}

	public EnumPre() {

	}

	public void method1() {
		rainbow[] rain = rainbow.values();
		for (rainbow r : rain) {
			System.out.print(r);
		}
		System.out.println();
	}

	public void method2() {
		consumer[] con = consumer.values();
		seller[] sel = seller.values();

		for (consumer c : con) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (seller s : sel) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(consumer c : con) {
			if(c.ordinal() > consumer.학생.ordinal()) {
				System.out.println(c.name()+"의 소비자 등급은 학생보다 높습니다.");
			} else if (c.ordinal() < consumer.학생.ordinal()) {
				System.out.println(c.name()+"의 소비자 등급은 학생보다 낮습니다.");
			} else {
				System.out.println(c.name()+"의 소비자 등급은 학생과 같습니다.");
			}
		}
		
		for(seller s : sel) {
			if(s.ordinal() > seller.중매업.ordinal()) {
				System.out.println(s.name()+"의 판매자 등급은 중매업보다 높습니다.");
			} else if (s.ordinal() < seller.중매업.ordinal()) {
				System.out.println(s.name()+"의 판매자 등급은 중매업보다 낮습니다.");
			} else {
				System.out.println(s.name()+"의 판매자 등급은 중매업과 같습니다.");
			}
		}
	}

	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.method1();
		ep.method2();
	}
}
