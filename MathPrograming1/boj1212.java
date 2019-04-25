package MathPrograming1;

import java.util.Scanner;

public class boj1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
		String s = sc.nextLine();
		boolean start = true;
		if(s.length() == 1 && s.charAt(0) == '0') {
			System.out.println(0);
		}
		for(int i=0; i<s.length(); i++) {
			int n = s.charAt(i)-'0';
			if(start == true && n<4) {
				if(n==0)	continue;
				if(n==1)	System.out.print("1");
				if(n==2)	System.out.print("10");
				if(n==3)	System.out.print("11");
				start = false;
			} else {
				System.out.print(eight[n]);
				start = false;
			}
		}
		
	}
}
