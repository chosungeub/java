package chamjo;

import java.util.Calendar;

public class M81004 {

	public static void main(String[] args) {
		//182p 8번
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum =0;
		double avg =0.0;
		int count=0; // 틀린부분
		for(int a=0; a<array.length; a++) {
			for(int b=0; b<array[a].length; b++) {
				sum +=array[a][b];
				count++; //틀린부분
			}
		}
			avg= (double)sum/count; //틀린부분
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
	}

}
