package chapter2;
/*
 * 代表game的类
 */
public class GuessGame {
	//实例变量用来表示player对象 
	Player p1;
	Player p2;
	Player p3;
	
	//game中的方法
	//启动游戏
	public void startGame() {
		//创建player对象
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//保存猜测数字
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//保存是否猜中
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//产生谜底数字0-9
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			
			//调用player的guess方法
			p1.guess();
			p2.guess();
			p3.guess();
			
			//取得猜测数字并列出
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player one guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player one guessed " + guessp3);
			
			//检查是否猜中
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			//游戏结果判断
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				
				break;//终止循环
			}else {
				System.out.println("Players will have to try again.");
			}
			
		}
	}
}
