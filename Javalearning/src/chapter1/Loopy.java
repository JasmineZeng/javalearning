package chapter1;
/*
 * ����ѭ���ṹ
 * 1. whileѭ��
 * 2. do-whileѭ��
 * 3. forѭ��
 * ****************
 * ѭ���Ĺؼ������������� conditional test
 * �����booleanֵ��true/false
 * �����ж�ʽ����Ҫ�ܹ������αֵ
 */
public class Loopy {
	
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the Loop");
		
		while (x < 4) {
			System.out.println("In the Loop");	
			System.out.println("Value of x is " + x);
			x = x + 1;
		}
		
		System.out.println("This is after the loop");
		
	}

}
