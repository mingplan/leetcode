package leetcode;


class MinStack {
    int length=100;
    int num[] = new int[length];
    int min[] = new int[length];
    int top=0;
    public void push(int x) {
        if(top<length-1){
            num[top]=x;
            if(top==0)
                min[top]=x;
            else{
                if(x<min[top-1])
                    min[top]=x;
                else
                    min[top]=min[top-1];
            }
            top++;
            
        }
    }

    public void pop() {
        if(top>0){
            top--;
        }
    }

    public int top() {
         if(top>0){
            int temp=top-1;
            return num[temp];
        }else{
            return 0;
        }
    }

    public int getMin() {
        return min[top-1];
    }
}


public class StackTest {

public static void main(String[] args){
		MinStack min = new MinStack();
		min.push(-3);
		System.out.println(min.getMin());
		min.push(0);
		min.push(-6);
		System.out.println(min.getMin());
		min.pop();
		System.out.println(min.getMin());
		min.pop();
		System.out.println(min.getMin());
		
		
	}
}
