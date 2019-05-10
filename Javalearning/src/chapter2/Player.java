package chapter2;
/*
 * 代表Player的类
 */
public class Player {
	//要猜的数字
	int number = 0;
	
	//guess的方法
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
