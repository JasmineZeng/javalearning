/*
 * 启动游戏
 * 进行游戏
 * 结束游戏
 * 包括：
 * 1. 生成三个DotCom对象，并为其保存名字
 * 2. 调用helper类，完成目标位置分配、获取用户输入、用户输入结果对比
 * 3. 判断游戏是否结束
 */
package chapter6;

import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	/*
	 * 启动游戏：
	 * 1. 初始化DotCom对象及名称（初始化dotComsList）
	 * 2. 为用户提供说明
	 * 3. 为每一个DotCom对象分配位置
	 */
	private void setUpGame() {
		//DotCom对象及其名称
		DotCom one = new DotCom();
		one.setName("EunJiwon");
		DotCom two = new DotCom();
		two.setName("G1");
		DotCom three = new DotCom();
		three.setName("SilverEun");
		
		//将上述DotCom对象放置进dotComsList
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//打印出对用户的提示
		System.out.println("Your goal is to find out all the Eun Jiwon.");
		System.out.println("EunJiwon, G1, SilverEun");
		System.out.println("Try to find them all in the fewest number of guesses.");
		
		//给每一个对象分配位置，通过helper实现
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	//判断何时结束游戏（dotComsList为空时结束游戏）
	private void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	//检查用户猜测
	private void checkUserGuess(String userGuess) {
		//增加记录的猜测次数
		numOfGuesses++;
		//先假设未命中
		String result = "miss";
		
		//对每一个DotCom对象的位置进行检查
		for(DotCom dotComToTest : dotComsList){
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				//从dotComsList中删除此对象
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		
		System.out.println(result);
	}
	
	//游戏结束
	private void finishGame() {
		System.out.println("All Eun Jiwon are found! You can have a story with him.");
		
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You can MARRY Eun Jiwon!!!!!");
		}else {
			System.out.println("Took you long enough " + numOfGuesses + " guesses.");
			System.out.println("You can be a friend of Eun Jiwon.");
		}
	}
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
