// 그리디 알고리즘 = 탐욕 알고리즘 = 욕심 알고리즘 
// 배낭 문제
// 배낭의 용량 M, 물체의 갯수 N, 물체의 무게 W, 물체의 이익 P
// 물체를 쪼개서 넣을 수 있다는 전제 조건이 붙으면 그리디 알고리즘을 사용하여
// 문제를 해결할 수 있다.

public class GreedyAlgorithm {
	public static void main(String[] args) {
		// 배낭의 용량
		int m = 20;
		// [물건의 무게][물건의 이익
		int[][] inPackage = {{7, 21},{5, 30},{4, 28},{7, 35},{2, 8}};
		long[] maxParray = new long[inPackage.length];
		for(int i = 0; i < maxParray.length; i++) {
			maxParray[i] = inPackage[i][1] / inPackage[i][0];
		}
		Arrays.sort(maxParray, new compareTo(object obj)  { 
			@Override 
				public long compare(Person o1, Person o2) { //o1보다 o2의 넘버가 크다면 //no기준 오름차순 정렬 if(o1.getNo()<o2.getNo()) { //1,2,3 return -1; } else if(o1.getNo()>o2.getNo()){ return 1; } else { return 0; } }
			}
		});
	
				
	}
	
	public static void knapsack(int m, int n, int p[], int w[]) {
		// 조건에 맞는 물체를 담는 배열 x 선언
		int x[] = new int[n];
		for(int i = 0; i < n; i++) x[i] = 0;
		int r = m;
		for(int i = 0; i < n; i++) {
			// 물체의 무게가 배낭의 용량보다 작을 경우 
			if(w[i] <= r) {
				// x에 물체를 전부(=1) 넣고 
				x[i] = 1;
				// r은 배낭의 용량 - 물체
				r = r - w[i];
			}
			else
				break;
		}
		// 아직 담기지 않은 물체가 남아있을경우 
		if(i < n) {
			
		}	
	}
	
}
