package chapter1;
/*
 * 三种循环结构
 * 1. while循环
 * 2. do-while循环
 * 3. for循环
 * ****************
 * 循环的关键在于条件测试 conditional test
 * 结果是boolean值，true/false
 * 条件判断式必须要能够求出真伪值
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
