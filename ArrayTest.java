package leetcode;

public class ArrayTest {
	
	//static HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	static int n=100;
	
	static boolean[] bool = new boolean[n];
	
	public static void main(String[] args){
		boolean[][] b = new boolean[100][100];
		set(b);
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
			
		
	}
	
	public static void set(boolean[][] a){
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				a[i][j]=false;
		hashSet(a.length);
		for(int i =0;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(bool[i]&&bool[j]){
					a[i][j]=true;
					a[j][i]=true;
				}
			}
		}
	}
	
	public static void hashSet(int n){
		
		
		for(int i=0;i<n;i++){
			bool[i]=true;
		}
		bool[0]=false;
		bool[1]=false;
		bool[2]=true;
		for(int i=2;i<n;i++){
			if(bool[i]){
				int k=2*i;
				while(k<n){
					bool[k]=false;
					k+=i;
				}
			}
		}
	}

}
