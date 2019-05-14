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
	private int comCount = 0;  //DotCom�ĸ���
	
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
		
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		//�����ַ���
		String[] alphacoords = new String[comSize];
		//��ʱ�ַ���
		String temp = null;
		//�����ַ���
		int[] coords = new int[comSize];
		//Ŀǰ���Ե��ַ���
		int attempts = 0;
		//�ҵ����ʵ�λ����
		boolean success = false;
		//Ŀǰ���
		int location = 0;
		
		//ÿ����һ������++
		comCount++;
		
		//ˮƽ����
		int incr = 1;
		//����ǵ����ţ���ֱ����
		if ((comCount%2) == 1) {
			incr = gridLength;
		}
		
		while (!success & attempts++ < 200) {
			//������
			location = (int)(Math.random() * gridSize);
			
			//��n��λ��
			int x = 0;
				//�ٶ��ɹ�
				success = true;
				while (success && x < comSize) {
					//����δʹ�õĵ㣬���δʹ�ã�����λ��
					if (grid[location] == 0) {
						coords[x++] = location;
						//������һ����
						location += incr;
						//��������±�Ե
						if (location >= gridSize) {
							success = false;
						}
						//��������ұ�Ե
						if (x>0 && (location%gridLength == 0)) {
							success = false;
						}
					}else { //�ҵ��Ѿ�ʹ�õ�λ��
						success = false;
					}
				}
		}
				
				//��λ��ת�����ַ�����ʽ
				int x = 0;
				int row = 0;
				int column = 0;
				
				while (x < comSize) {
					//��ʶ��������
					grid[coords[x]] = 1;
					//�õ��е�ֵ
					row = (int) (coords[x] / gridLength);
					//�õ��е�ֵ
					column = coords[x] % gridLength;
					//ת�����ַ���
					temp = String.valueOf(alphabet.charAt(column));
					//����������֣�ת����������λ���ַ���������alphaCells��
					alphaCells.add(temp.concat(Integer.toString(row)));
					
					x++;
					
					//��ӡ��λ��
					//System.out.println("  coord " + x +" = "+ alphaCells.get(x-1));
				}
				
				return alphaCells;
		}
	}

