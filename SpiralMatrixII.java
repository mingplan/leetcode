package leetcode;

public class SpiralMatrixII {

	public int[][] generateMatrix(int n) {

		int startX = 0;
		int endX = n - 1;
		int startY = 0;
		int endY = n - 1;
		int[][] mat = new int[n][n];
		int count=1;
		while(startX<=endX && startY <= endY){
			
			for(int i=startX;i<=endX;i++){
				mat[startY][i]=count++;
			}
			startY++;
			
			for(int i =startY;i<=endY;i++){
				mat[i][endX]=count++;
			}
			endX--;
			
			for(int i=endX;i>=startX;i--){
				mat[endY][i]=count++;
			}
			endY--;
			
			for(int i=endY;i>=startY;i--){
				mat[i][startX]=count++;
			}
			startX++;
		}
		return mat;
	}
}
