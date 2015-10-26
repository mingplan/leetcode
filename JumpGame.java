package leetcode;

public class JumpGame {

	public static void main(String[] args) {
		JumpGame jump = new JumpGame();
		int[] a = { 2, 0 };
		System.out.println(jump.canJump(a));
	}

	public boolean canJump(int[] nums) {

		if (nums.length == 1)
			return true;
		int i = 0;
		while (i < nums.length) {
			int[] temp = new int[nums[i]];
			int max = 0;
			int index = 0;
			boolean flag = true;
			for (int j = 1; j <= nums[i]; j++) {
				if (i + j >= nums.length) {
					return true;
				}
				temp[j - 1] = nums[i + j] + j;
				if (max < temp[j - 1]) {
					max = temp[j - 1];
					index = j;
				}
				flag = false;
			}

			if (flag)
				return false;
			int k = max + i + 1;
			if (k >= nums.length) {
				return true;
			} else {
				i = index + i;
				
			}
		}

		return false;
	}
}
