package leetcode;

public class ValidSudoku {
	
	public static void main(String[] args){
		ValidSudoku v = new ValidSudoku();
		String[] str = {"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
		char[][] ch = new char[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				ch[i][j]=str[i].charAt(j);
			}
		}
		v.isValidSudoku(ch);
	}

	public boolean isValidSudoku(char[][] board) {

		int[] bl = new int[10];
		
		//所有行都是有效的
		for(int i=0;i<board.length;i++){
			for(int k=1;k<10;k++)
				bl[k]=0;
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]!='.'&&bl[board[i][j]-'0']==0){
					bl[board[i][j]-'0']=1;
				}else if(board[i][j]!='.'&&bl[board[i][j]-'0']!=0){
					return false;
				}
			}
		}
		//所有列都是有效的
		
		for(int i=0;i<board[0].length;i++){
			for(int k=1;k<10;k++)
				bl[k]=0;
			for(int j=0;j<board.length;j++){
				if(board[j][i]!='.'&&bl[board[j][i]-'0']==0){
					bl[board[j][i]-'0']=1;
				}else if(board[j][i]!='.'&&bl[board[j][i]-'0']!=0){
					return false;
				}
			}
		}
		//所有方块都是有效的
		for(int k=0;k<board.length;k=k+3){
			for(int m=0;m<board.length;m=m+3){
				for(int i=1;i<10;i++)
					bl[i]=0;
				for(int i=k;i<k+3;i++){
					for(int j=m;j<m+3;j++){
						if(board[i][j]!='.'&&bl[board[i][j]-'0']==0){
							bl[board[i][j]-'0']=1;
						}else if(board[i][j]!='.'&&bl[board[i][j]-'0']!=0){
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
