package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] ani = new Animal[10];
		String[] aniName = { "코코", "보리", "콩이", "초코", "두부", "호두", "별이", "사랑이", "까미", "몽이", "토리", "마루", "구름", "뭉치" };
		String[] dogkind = { "허스키", "푸들", "비숑", "삽살개", "차우차우" };
		String[] local = { "집", "공원", "경찰서", "소방서", "생선가게" };
		String[] catColor = { "하얀색", "검은색", "노랑색", "하늘색", "갈색" };
		String[] catkind = { "랙돌", "러시안블루", "뱅갈", "페르시안", "샴", "아메리칸쇼트헤어" };
		String[] rabbitKind = { "네덜란드 드워프", "드워프 오토", "롭 토끼", "라이언헤드", "더치" };
		String[] horseKind = { "가리온", "머스탱", "샤이어", "서레브레드", "아라비안" };
		int[] num = new int[ani.length];

		for (int i = 0; i < ani.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;

			if (num[i] % 4 == 0) {
				ani[i] = new Dog(aniName[(int) (Math.random() * 14)], dogkind[(int) (Math.random() * 5)],
						(int) (Math.random() * 15)+1);
			} else if (num[i] % 4 == 1) {
				ani[i] = new Cat(aniName[(int) (Math.random() * 14)], catkind[(int) (Math.random() * 6)],
						local[(int) (Math.random() * 5)], catColor[(int) (Math.random() * 5)]);
			} else if (num[i] % 4 == 2) {
				ani[i] = new Rabbit(aniName[(int) (Math.random() * 14)], rabbitKind[(int) (Math.random() * 5)], (int) (Math.random() * 5)+1, catColor[(int) (Math.random() * 5)]);
				
			} else {
				ani[i] = new Horse(aniName[(int) (Math.random() * 14)], horseKind[(int) (Math.random() * 5)], local[(int) (Math.random() * 5)], catColor[(int) (Math.random() * 5)]);
			}
		}

		for (Animal a : ani) {
			a.speak();
		}
	}
}
