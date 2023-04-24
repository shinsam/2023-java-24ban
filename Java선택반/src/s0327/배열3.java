package s0327;

public class 배열3 {

	public static void main(String[] args) {
		// 2차원 배열
		int a[][] = new int [][] {{1,2,3}, {10,20,30}};
		int [][]b = new int [2][3];
		int c[][] = new int [][] {{1,2,3},{4,5,6}}; 
		
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++)
				System.out.printf("%d행 %d열 : %d\n" , i , j , a[i][j]);
		}
	}

}
