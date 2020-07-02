package Test1;

import java.util.Scanner;

/*
 * 힐기능추가 (힐은 3번가능 , 즉 private int heal = 3 , 한번쓸때마다   --heal; 기능 추가
 * 턴이 5번될때마다 한캐릭터에게 기회주기 (랜덤 *3 +1 (?)) 로 하기 ( 그래서 게임 전체 턴이 돌아갈때마다 count++; 누적해줘야됨 )
 * 캐릭 선택하기 기능 추가 
 */
public class Unit {
	Scanner scan = new Scanner(System.in);

	private String name;
	private int hp;
	private int damage;

	public Unit(Object object, int i, int j) {
	}

	public Unit(String name, int hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
		System.out.println("캐릭이름 : " + getName() + " 이 생성되었습니다");
		System.out.println("캐릭체력 : " + getHp());
		System.out.println("캐릭댐지 : \n" + getDamage());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public String getDamage() {
		String n = "캐릭 데미지 : " + this.damage;
		return n;
	}

	public void attack(Unit u) {

		while (true) {
			System.out.print("번호 선택 : ");
			
			int num = scan.nextInt();

			// 객체화 시키기 ( if 중복됨 ) 
			if (num == 1) {
				System.out.println(this.name + "이 " + u.name + "을 공격합니다");
				u.hp -= this.damage;
				System.out.println("현재 " + u.name + "체력 : " + u.getHp());

				if (u.hp < 0 || u.hp == 0) {
					System.out.println(u.name + "이 죽었습니다");
					System.out.println("== Game Over ==");
					break;
				}
			}
			
			if (num == 2) {
				System.out.println(u.name + "이" + this.name + "을 공격합니다");
				this.hp -= u.damage;
				System.out.println("현재 " + this.name + "체력 : " + this.getHp());

				if (this.hp < 0 || this.hp == 0) {
					System.out.println(this.name + "이 죽었습니다");
					System.out.println("== Game Over ==");
					break;
				}
			}
		}

	}

}
