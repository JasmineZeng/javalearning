/*
 * 先编写测试类
 * 以便了解需要实现什么功能
 */
package chapter5;

public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		//首先应该要创建一个DotCom对象
		SimpleDotCom dot = new SimpleDotCom();
		
		//创建带有dot com位置的数组
		int[] locations = {2,3,4};
		
		//调用dot com的setter来设置dot com的位置
		dot.setLocationCells(locations);
		
		//设置一个假定的用户猜测
		String userGuess = "2";
		
		//调用dot com的方法并传入数据，并得到结果
		String result = dot.checkYourself(userGuess);
		
		//显示测试结果
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		//打印出测试结果
		System.out.println(testResult);
	}

}
