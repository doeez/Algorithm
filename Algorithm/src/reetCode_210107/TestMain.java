package reetCode_210107;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	
	public static int reverse(int x) {
		String[] xToArr = Integer.toString(x).split("");
		String xToString = "";
		for(int i = 0; i < xToArr.length; i++) {
			if(xToArr[i].equals("-"))
				continue;
			xToString = xToArr[i] + xToString;
		}
		if(x < 0)
			xToString = "-"+xToString;
		x = Integer.parseInt(xToString);
		
        return x;
    }
}
