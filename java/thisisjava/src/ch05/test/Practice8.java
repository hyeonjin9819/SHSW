package ch05.test;

public class Practice8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		// 전체합과 평균
		int sumAll =0;
		double avgAll =0;
		int cnt = 0; // 전체갯수
		
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j<array[i].length; j++) {
				sumAll += array[i][j];
				cnt += 1;
			}
		}
		avgAll = (double)sumAll / cnt;
		System.out.println(avgAll);
	}
}
