package ch05.ch07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		System.out.println("1차원 배열 길이 (반의 수) : " + scores.length);
		System.out.println("2차원 배열 길이 (첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이 (두 번째 반의 학생 수) : " + scores[1].length);

		// 첫번째 반 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2]: " + scores[0][2]);
		// 두번째 반 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++ ) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		int class2Sum = 0;
		for(int i =0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		
		for(int i=0; i<scores.length; i++ ) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
		
		System.out.println("----------------------------");
		// 반의 평균점수, 합 한번에 계산하기
		for(int i =0; i<scores.length; i++) {
			double allSum = 0; // 반별로 전체 합
			double allAverage= 0; // 반별 전체 평균
			for(int j =0; j<scores[i].length; j++) {
				allSum += scores[i][j];
			}
			allAverage = allSum/(double)(scores[i].length);
			System.out.println((i+1) + "반의 점수 총합은 " + allSum + "점 입니다.");
			System.out.println((i+1) + "반의 점수 평균은 " + allAverage + "점 입니다.");
		}
		
	}

}
