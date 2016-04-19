/**
 *	请实现一个函数，将一个字符串中的空格替换成“%20”。
 *	例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 *	Author: matao
 */

public class ReplaceBlank {
/**	
 * 	 1. 统计字符串长度和空格数量；
 *   2. 新长度=原来+空格*2；
 *   3. 当等于空格时，替换；不等于是移动；
 */
	public static String replaceBlank1(String str) {
		if(str == null || str.length() == 0) {
			return null;
		}
		char[] strArray = str.toCharArray();
		int blankNum = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				blankNum++;
			}
		}
		
		int i = str.length() - 1, j = i + 2 * blankNum;
		char[] newArray = new char[j+1];
		for (int k = 0; k < strArray.length; k++) {
			newArray[k] = strArray[k];
		}
		
		while(i >= 0 && i < j) {
			if(newArray[i] == ' ') {
				newArray[j--] = '0';
				newArray[j--] = '2';
				newArray[j--] = '%';
			} else {
				newArray[j--] = newArray[i];
			}
			i--;
		}
		return new String(newArray);
	}

	// 调用API
	public static String replaceBlank2(String str) {
		if(str == null || str.length() == 0) {
			return null;
		}
		return str.replaceAll(" ", "%20");
	}

	public static void main(String[] args) {
		String str1 = "we are happy.";
		System.out.println(replaceBlank1(str1));

		String str2 = "  ";
		System.out.println(replaceBlank1(str2));

		String str3 = "";
		System.out.println(replaceBlank1(str3));		
	}
}
