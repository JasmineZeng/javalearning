/*
 * 最终的simple dot com类
 */
package chapter5;

import java.util.Iterator;

public class SimpleDotCom {
	
	//放置dot com目标的位置的数组
	int[] locationCells;
	
	//标记hit的次数,初始化为0
	int numOfHits = 0;
	
	//设置dot com位置的方法，接收test传来的目标位置数组
	public void setLocationCells (int[] locs) {
		locationCells = locs;
	}
	
	//设置检验用户guess判定的方法，返回miss，hit，killed
	public String checkYourself (String stringGuess) {
		//将代表数字的String转化为int类型
		int guess = Integer.parseInt(stringGuess);
		
		//将result初始化为miss
		String result = "miss";
		
		//用于数组的for循环，将每一个数组元素赋值给声明的变量
		for(int cell : locationCells){
			if (guess == cell) {
				
				//设置新的结果
				result = "hit";
				//增加hit次数
				numOfHits++;
				break;
			}
		}
		
		//检测是否全部击中
		if (numOfHits == locationCells.length) {
			//设置新的结果
			result = "kill";
		}
		
		//打印结果
		System.out.println(result);
		
		//不要忘记返回结果
		return result;
	}
}
