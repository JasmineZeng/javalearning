/*
 * ������Ϸ
 * ������Ϸ
 * ������Ϸ
 * ������
 * 1. ��������DotCom���󣬲�Ϊ�䱣������
 * 2. ����helper�࣬���Ŀ��λ�÷��䡢��ȡ�û����롢�û��������Ա�
 * 3. �ж���Ϸ�Ƿ����
 */
package chapter6;

import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	/*
	 * ������Ϸ��
	 * 1. ��ʼ��DotCom�������ƣ���ʼ��dotComsList��
	 * 2. Ϊ�û��ṩ˵��
	 * 3. Ϊÿһ��DotCom�������λ��
	 */
	private void setUpGame() {
		//DotCom����������
		DotCom one = new DotCom();
		one.setName("EunJiwon");
		DotCom two = new DotCom();
		two.setName("G1");
		DotCom three = new DotCom();
		three.setName("SilverEun");
		
		//������DotCom������ý�dotComsList
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//��ӡ�����û�����ʾ
		System.out.println("Your goal is to find out all the Eun Jiwon.");
		System.out.println("EunJiwon, G1, SilverEun");
		System.out.println("Try to find them all in the fewest number of guesses.");
		
		//��ÿһ���������λ�ã�ͨ��helperʵ��
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	//�жϺ�ʱ������Ϸ��dotComsListΪ��ʱ������Ϸ��
	private void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	//����û��²�
	private void checkUserGuess(String userGuess) {
		//���Ӽ�¼�Ĳ²����
		numOfGuesses++;
		//�ȼ���δ����
		String result = "miss";
		
		//��ÿһ��DotCom�����λ�ý��м��
		for(DotCom dotComToTest : dotComsList){
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				//��dotComsList��ɾ���˶���
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		
		System.out.println(result);
	}
	
	//��Ϸ����
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
