package chamjo;

import java.util.Calendar;

public class M81004 {

	public static void main(String[] args) {
		//182p 8��
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum =0;
		double avg =0.0;
		int count=0; // Ʋ���κ�
		for(int a=0; a<array.length; a++) {
			for(int b=0; b<array[a].length; b++) {
				sum +=array[a][b];
				count++; //Ʋ���κ�
			}
		}
			avg= (double)sum/count; //Ʋ���κ�
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
	}

}
