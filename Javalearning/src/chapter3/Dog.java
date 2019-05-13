/*
 * Dog的范例
 */

package chapter3;

public class Dog {

	String name;
	
	public static void main (String[] args) {
		
		//创建dog对象
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
				
		//创建dog数组
		Dog[] myDogs = new Dog[3];
		
		//创建dog对象
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//通过数组引用存取dog
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//dog2的名字是？
		System.out.println("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		//逐个对dog执行bark
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark() {
		System.out.println(name + " says Ruff!");
	}
}
