/*
 * ����ArrayList�ı�����ı�ʾ����
 * �Զ�ɾ��
 * ArrayList�Ǹ����������Լ��ķ���
 */
package chapter6;

import java.util.ArrayList;

public class DotCom {
	
//		//����dot comĿ���λ�õ�����
//		int[] locationCells;   
//		
//		//���hit�Ĵ���,��ʼ��Ϊ0
//		int numOfHits = 0;   ����Ҫ�����ı����
	
	private ArrayList<String> locationCells;
	//����DotCom������
	private String name;
		
		//����dot comλ�õķ���������test������Ŀ��λ������
		public void setLocationCells (ArrayList<String> locs) {
			locationCells = locs;
		}
		
		//������setter����
		public void setName(String n) {
			name = n;
		}
		
		//���ü����û�guess�ж��ķ���������miss��hit��killed
		public String checkYourself (String userInput) {
//			//���������ֵ�Stringת��Ϊint����
//			int guess = Integer.parseInt(stringGuess);
			//Ҳ����Ҫ����ת����
			
			//��result��ʼ��Ϊmiss
			String result = "miss";
			
//			//���������forѭ������ÿһ������Ԫ�ظ�ֵ�������ı���
//			for(int cell : locationCells){
//				if (guess == cell) {
//					
//					//�����µĽ��
//					result = "hit";
//					//����hit����
//					numOfHits++;
//					break;
//				}
//			}
			
			//�޸�����
			//indexOf������������ض����������������-1
			int index = locationCells.indexOf(userInput);
			
			if (index >= 0) { //˵��λ��Array���и�Ԫ�أ�������
				//ɾ���Ѿ����еĸ���
				locationCells.remove(index);
				//�ж��Ƿ��������Array��ȫ����գ������
				if (locationCells.isEmpty()) {
					result = "kill";
					System.out.println("Ouch! You find " + name + ". Yeah!!!!!");
				}else {
					result = "hit";
				}
			}
			
//			//����Ƿ�ȫ������
//			if (numOfHits == locationCells.length) {
//				//�����µĽ��
//				result = "kill";
//			}
			
			//��ӡ���
			//System.out.println(result);
			
			//��Ҫ���Ƿ��ؽ��
			return result;
		}
}
