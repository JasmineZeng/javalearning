/*
 * 利用ArrayList改变数组的表示方法
 * 自动删除
 * ArrayList是个对象，有其自己的方法
 */
package chapter6;

import java.util.ArrayList;

public class DotCom {
	
//		//放置dot com目标的位置的数组
//		int[] locationCells;   
//		
//		//标记hit的次数,初始化为0
//		int numOfHits = 0;   不需要这样的标记了
	
	private ArrayList<String> locationCells;
	//增加DotCom的名称
	private String name;
		
		//设置dot com位置的方法，接收test传来的目标位置数组
		public void setLocationCells (ArrayList<String> locs) {
			locationCells = locs;
		}
		
		//基本的setter方法
		public void setName(String n) {
			name = n;
		}
		
		//设置检验用户guess判定的方法，返回miss，hit，killed
		public String checkYourself (String userInput) {
//			//将代表数字的String转化为int类型
//			int guess = Integer.parseInt(stringGuess);
			//也不需要类型转换了
			
			//将result初始化为miss
			String result = "miss";
			
//			//用于数组的for循环，将每一个数组元素赋值给声明的变量
//			for(int cell : locationCells){
//				if (guess == cell) {
//					
//					//设置新的结果
//					result = "hit";
//					//增加hit次数
//					numOfHits++;
//					break;
//				}
//			}
			
			//修改如下
			//indexOf这个方法，返回对象参数的索引或者-1
			int index = locationCells.indexOf(userInput);
			
			if (index >= 0) { //说明位置Array中有该元素，则命中
				//删除已经命中的格子
				locationCells.remove(index);
				//判断是否击沉，若Array中全部清空，则击沉
				if (locationCells.isEmpty()) {
					result = "kill";
					System.out.println("Ouch! You find " + name + ". Yeah!!!!!");
				}else {
					result = "hit";
				}
			}
			
//			//检测是否全部击中
//			if (numOfHits == locationCells.length) {
//				//设置新的结果
//				result = "kill";
//			}
			
			//打印结果
			//System.out.println(result);
			
			//不要忘记返回结果
			return result;
		}
}
