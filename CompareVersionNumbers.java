package leetcode;

public class CompareVersionNumbers {

	public static void main(String[] args) {

		System.out.println(compareVersion("1.1.6", "1.1.6.1"));
	}

	public static int compareVersion(String version1, String version2) {
		int flag = 0;
		if (version1.equals(version2)) {
			flag = 0;

		} else {
			String str1[] = version1.split("\\.");
			String str2[] = version2.split("\\.");

			int i = 0;
			while (str1[i].equals(str2[i])) {
				if(i<str1.length-1&&i<str2.length-1){
					i++;
				}
				else{
					break;
				}
					
			}
			String s1 = str1[i];
			String s2 = str2[i];
			if (!s1.equals(s2)) {
				int a = Integer.parseInt(str1[i]);
				int b = Integer.parseInt(str2[i]);
				if (a > b)
					flag = 1;
				else
					flag = -1;
			} else {
				if (i > str1.length-1)
					flag = -1;
				if (i > str2.length-1)
					flag = 1;
			}

		}

		return flag;
	}

}
