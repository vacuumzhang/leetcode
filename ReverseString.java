package leetcode;

public class ReverseString {
	public String reverseString(String s) {
        String result = new StringBuffer(s).reverse().toString();
        return result;
	}
}
