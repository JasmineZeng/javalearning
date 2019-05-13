/*
 * ���յ�simple dot com��
 */
package chapter5;

import java.util.Iterator;

public class SimpleDotCom {
	
	//����dot comĿ���λ�õ�����
	int[] locationCells;
	
	//���hit�Ĵ���,��ʼ��Ϊ0
	int numOfHits = 0;
	
	//����dot comλ�õķ���������test������Ŀ��λ������
	public void setLocationCells (int[] locs) {
		locationCells = locs;
	}
	
	//���ü����û�guess�ж��ķ���������miss��hit��killed
	public String checkYourself (String stringGuess) {
		//���������ֵ�Stringת��Ϊint����
		int guess = Integer.parseInt(stringGuess);
		
		//��result��ʼ��Ϊmiss
		String result = "miss";
		
		//���������forѭ������ÿһ������Ԫ�ظ�ֵ�������ı���
		for(int cell : locationCells){
			if (guess == cell) {
				
				//�����µĽ��
				result = "hit";
				//����hit����
				numOfHits++;
				break;
			}
		}
		
		//����Ƿ�ȫ������
		if (numOfHits == locationCells.length) {
			//�����µĽ��
			result = "kill";
		}
		
		//��ӡ���
		System.out.println(result);
		
		//��Ҫ���Ƿ��ؽ��
		return result;
	}
}
