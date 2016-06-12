package leetcode;

public class AddDigits {
	//with loop
	public int addDigits(int num) {
        while(num/9 != 0 && num != 9){
            num = num/10 + num%10;
        }
        return num;
    }
	//without loop
	public int addDIgits2(int num) {
		if (num == 0) return 0;
		if (num % 9 ==0) return 9;
		else return num%9;
	}
}
