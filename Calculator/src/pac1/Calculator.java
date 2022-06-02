package pac1;

import java.util.Scanner;

public class Calculator {

	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public void plusPlus(int x, String y, int z) {
		int result = 0;
		switch (y) {
		case "+" : result = x+z; break;
		case "-" : result = x-z; break;
		case "/" : result = x/z; break;
		case "*" : result = x*z; break;
		}
		System.out.println(result);
	}
	
}
