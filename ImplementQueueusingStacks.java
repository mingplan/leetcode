package leetcode;

import java.util.Stack;

/** 
 * @description: TODO(描述这个类的作用) 
 * @author ming
 * @date 2015年7月7日
 */

public class ImplementQueueusingStacks {

	class MyQueue {
		private Stack<Integer> stend = new Stack<Integer>();
		private Stack<Integer> stfront = new Stack<Integer>();
	    // Push element x to the back of queue.
	    public void push(int x) {
	        stend.push(x);
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        while(!stend.isEmpty()){
	        	stfront.push(stend.pop());
	        }
	        stfront.pop();
	        while(!stfront.isEmpty()){
	        	stend.push(stfront.pop());
	        }
	    }

	    // Get the front element.
	    public int peek() {
	    	int ans;
	    	while(!stend.isEmpty()){
	        	stfront.push(stend.pop());
	        }
	        ans = stfront.peek();
	        while(!stfront.isEmpty()){
	        	stend.push(stfront.pop());
	        }
	        return ans;
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return stend.isEmpty();
	    }
	}
}
