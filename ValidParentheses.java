package leetcode;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {

		String str = "}";
		System.out.println(isValid(str));
	}

	public static boolean isValid(String s) {
		Stack st = new Stack();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!st.isEmpty()) {
					char ch = (char) st.peek();
					if (ch == '(')
						st.pop();
					else
						return false;
				}else
					return false;
				

			} else if (s.charAt(i) == ']') {
				if (!st.isEmpty()) {
					char ch = (char) st.peek();
					if (ch == '[')
						st.pop();
					else
						return false;
				}else
					return false;

			} else if (s.charAt(i) == '}') {
				if (!st.isEmpty()) {
					char ch = (char) st.peek();
					if (ch == '{')
						st.pop();
					else
						return false;
				}else
					return false;

			}

		}

		if (st.isEmpty())
			return true;
		else
			return false;

	}

}
