/*
 * �ȱ�д������
 * �Ա��˽���Ҫʵ��ʲô����
 */
package chapter5;

public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		//����Ӧ��Ҫ����һ��DotCom����
		SimpleDotCom dot = new SimpleDotCom();
		
		//��������dot comλ�õ�����
		int[] locations = {2,3,4};
		
		//����dot com��setter������dot com��λ��
		dot.setLocationCells(locations);
		
		//����һ���ٶ����û��²�
		String userGuess = "2";
		
		//����dot com�ķ������������ݣ����õ����
		String result = dot.checkYourself(userGuess);
		
		//��ʾ���Խ��
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		//��ӡ�����Խ��
		System.out.println(testResult);
	}

}
