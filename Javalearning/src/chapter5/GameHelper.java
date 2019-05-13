/*
 * 从命令行取得用户输入
 */
package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
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
		
		return inputLine;
	}
}
