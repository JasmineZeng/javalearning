/*
 * 封装
 * 实例变量设为私有
 * 方法设为public
 */
package chapter4;

public class GoodDog {
	
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	public void bark() {
		if (size > 60) {
			System.out.println("Wooof!Wooof!");
		} else if (size > 40) {
			System.out.println("Ruff!Ruff!");
		} else {
			System.out.println("Yip!Yip!");
		}
	}

}
