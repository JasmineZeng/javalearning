/*
 * 游戏类
 */
package chapter5;

public class SimpleDotComGame {
	
	public static void main (String[] args) {
		
		//记录玩家猜测的次数
		int numOfGuesses = 0;
		
		//帮助取得玩家输入的对象
		GameHelper helper = new GameHelper();
		
		//创建dot com对象
		SimpleDotCom theDotCom = new SimpleDotCom();
		//用随机数产生第一格的位置（0-4）
		int randomNum = (int) (Math.random() * 5);
		//根据上述产生的随机数，生成dot com的位置数组
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		//将此位置信息赋值
		theDotCom.setLocationCells(locations);
		
		//记录游戏是否进行，即dot com是否存活
		boolean isAlive = true;
		
		while (isAlive == true) {
			//取得玩家输入的字符串
			String guess = helper.getUserInput("enter a number");
			
			//检查玩家的输入结果，并储存（此过程中已经输出结果
			String result = theDotCom.checkYourself(guess);
			
			//增加猜测次数
			numOfGuesses++;
			
			//检测是否击沉
			if (result.equals("kill")) {
				//改变游戏状态
				isAlive = false;
				//输出游戏结果（猜测次数）
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
