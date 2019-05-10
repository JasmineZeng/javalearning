package chapter2;
/*
 * ����game����
 */
public class GuessGame {
	//ʵ������������ʾplayer���� 
	Player p1;
	Player p2;
	Player p3;
	
	//game�еķ���
	//������Ϸ
	public void startGame() {
		//����player����
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//����²�����
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//�����Ƿ����
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//�����յ�����0-9
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			
			//����player��guess����
			p1.guess();
			p2.guess();
			p3.guess();
			
			//ȡ�ò²����ֲ��г�
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player one guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player one guessed " + guessp3);
			
			//����Ƿ����
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			//��Ϸ����ж�
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				
				break;//��ֹѭ��
			}else {
				System.out.println("Players will have to try again.");
			}
			
		}
	}
}
