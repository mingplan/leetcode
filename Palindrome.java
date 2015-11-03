package leetcode;

import java.util.Stack;
import java.util.Queue;
public class Palindrome {
	
	public static void main(String[] args){
		int num=1783223871;
		System.out.println(num);
		System.out.println(isPalindrome(num));
	}
	
	public static boolean isPalindrome(int x) {
        int a[]=new int[32];
        int i=0;
        if(x<0) return false;
        while(x!=0){
            a[i++]=x%10;
            System.out.println(a[i-1]);
            x=x/10;
        }
        System.out.println(i);
        int m,n;
        m=0;
        n=i-1;
        while(m<=n){
        	if(a[m]!=a[n])
        		return false;
        	m++;
        	n--;
        }
        
        return true;
    }

}
