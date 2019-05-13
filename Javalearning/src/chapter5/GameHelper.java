/*
 * ��������ȡ���û�����
 */
package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
	public String getUserInput (String prompt) {
		//�����û�����
		String inputLine = null;
		//��ӡ����ʾ��
		System.out.print(prompt + " ");
		
		try {
			//��ȡ����������
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
