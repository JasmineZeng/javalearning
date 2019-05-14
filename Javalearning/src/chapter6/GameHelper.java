package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;  //DotCom的个数
	
	public String getUserInput (String prompt) {
		//储存用户输入
		String inputLine = null;
		//打印出提示语
		System.out.print(prompt + " ");
		
		try {
			//读取命令行输入
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException: " + e);
		}
		
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		//保存字符串
		String[] alphacoords = new String[comSize];
		//临时字符串
		String temp = null;
		//现有字符串
		int[] coords = new int[comSize];
		//目前测试的字符串
		int attempts = 0;
		//找到合适的位置吗？
		boolean success = false;
		//目前起点
		int location = 0;
		
		//每处理一个，则++
		comCount++;
		
		//水平增量
		int incr = 1;
		//如果是单数号，垂直增量
		if ((comCount%2) == 1) {
			incr = gridLength;
		}
		
		while (!success & attempts++ < 200) {
			//随机起点
			location = (int)(Math.random() * gridSize);
			
			//第n个位置
			int x = 0;
				//假定成功
				success = true;
				while (success && x < comSize) {
					//查找未使用的点，如果未使用，储存位置
					if (grid[location] == 0) {
						coords[x++] = location;
						//尝试下一个点
						location += incr;
						//如果超出下边缘
						if (location >= gridSize) {
							success = false;
						}
						//如果超出右边缘
						if (x>0 && (location%gridLength == 0)) {
							success = false;
						}
					}else { //找到已经使用的位置
						success = false;
					}
				}
		}
				
				//将位置转换成字符串形式
				int x = 0;
				int row = 0;
				int column = 0;
				
				while (x < comSize) {
					//标识格子已用
					grid[coords[x]] = 1;
					//得到行的值
					row = (int) (coords[x] / gridLength);
					//得到列的值
					column = coords[x] % gridLength;
					//转换成字符串
					temp = String.valueOf(alphabet.charAt(column));
					//后面接上数字，转化成完整的位置字符串，存在alphaCells中
					alphaCells.add(temp.concat(Integer.toString(row)));
					
					x++;
					
					//打印出位置
					//System.out.println("  coord " + x +" = "+ alphaCells.get(x-1));
				}
				
				return alphaCells;
		}
	}

