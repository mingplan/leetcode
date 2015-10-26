package leetcode;

public class UglyNumberII {

	public static void main(String[] args){
		UglyNumberII number = new UglyNumberII();
		int a = number.nthUglyNumber(7);
		System.out.println(a);
	}
	public int nthUglyNumber(int n) {
		if(n==1)return 1;
		int len = n/2+1;
		int[] a1 = new int[len];
		int[] a2 = new int[len];
		int[] a3 = new int[len];
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		for(int i=0;i<len;i++){
			if(i%3!=0){
				a1[i]=p1*(i+1);
			}
			a2[i]=p2*(i+1);
			a3[i]=p3*(i+1);
		}
		int i=2;
		int m=0;
		int k=0;
		int l=0;
		int result =0;
		while(i<=n){
			if(a1[m]<a2[k]){
				if(a1[m]<a3[l]){
					result = a1[m];
					m++;
					i++;
					
				}else{
					result = a3[l];
					l++;
					i++;
				}
			}else{
				if(a2[k]<a3[l]){
					result = a2[k];
					k++;
					i++;
				}else{
					result = a3[l];
					l++;
					i++;
				}
			}
		}
		return result;
	}
}
