package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		SpiralMatrix matrix = new SpiralMatrix();
		int[][] a = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> list = matrix.spiralOrder(a);
		
		for(Integer i : list){
			System.out.println(i);
		}
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> list = new ArrayList<>();
		if(matrix.length == 0) return list;
		if(matrix.length == 1 ) {
			for(int i=0;i<matrix[0].length;i++){
				list.add(matrix[0][i]);
			}
			return list;
		}
		if(matrix[0].length==1){
			for(int i=0;i<matrix.length;i++){
				list.add(matrix[i][0]);
			}
			return list;
		}
		int startX = 0;
		int endX = matrix[0].length-1 ;
		
		int startY = 0;
		int endY = matrix.length-1;
		
		while(startX<=endX&&startY<=endY){
			
			for(int i=startX;i<=endX;i++){
				list.add(matrix[startY][i]);
			}
			startY++;
			if(startY>endY)
				break;
			for(int i=startY;i<=endY;i++){
				list.add(matrix[i][endX]);
			}
			endX--;
			if(startX>endX)
				break;
			for(int i=endX;i>=startX;i--){
				list.add(matrix[endY][i]);
			}
			
			endY--;
			if(startY>endY)
				break;
			
			for(int i=endY;i>=startY;i--){
				list.add(matrix[i][startX]);
			}
			startX++;
			if(startX>endX)
				break;
		}
		return list;
	}
}
