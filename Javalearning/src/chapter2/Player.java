package chapter2;
/*
 * ����Player����
 */
public class Player {
	//Ҫ�µ�����
	int number = 0;
	
	//guess�ķ���
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
