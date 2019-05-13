/*
 * ��Ϸ��
 */
package chapter5;

public class SimpleDotComGame {
	
	public static void main (String[] args) {
		
		//��¼��Ҳ²�Ĵ���
		int numOfGuesses = 0;
		
		//����ȡ���������Ķ���
		GameHelper helper = new GameHelper();
		
		//����dot com����
		SimpleDotCom theDotCom = new SimpleDotCom();
		//�������������һ���λ�ã�0-4��
		int randomNum = (int) (Math.random() * 5);
		//�������������������������dot com��λ������
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		//����λ����Ϣ��ֵ
		theDotCom.setLocationCells(locations);
		
		//��¼��Ϸ�Ƿ���У���dot com�Ƿ���
		boolean isAlive = true;
		
		while (isAlive == true) {
			//ȡ�����������ַ���
			String guess = helper.getUserInput("enter a number");
			
			//�����ҵ��������������棨�˹������Ѿ�������
			String result = theDotCom.checkYourself(guess);
			
			//���Ӳ²����
			numOfGuesses++;
			
			//����Ƿ����
			if (result.equals("kill")) {
				//�ı���Ϸ״̬
				isAlive = false;
				//�����Ϸ������²������
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
