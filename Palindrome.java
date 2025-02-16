package LCProblems;

// Runtime --> 4 ms
// Memory --> 44.10 MB

import java.util.Scanner;

public class Palindrome {
	    static int rev(int x,int res){
	        while(x!=0){
	            int a = x % 10;
	            res = res * 10 + a;
	            x/=10;
	        }
	        return res;
	    }
	  public static boolean isPalindrome(int x) {
	        int res =0;
	        if(x<0){
	            return false;
	        }
	        res = rev(x,res);
	        if(x==res){
	            return true;
	        }else{
	            return false;
	        }
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	if(isPalindrome(num)) {
        	System.out.println("It is a Palindrome");
    	}else {
        	System.out.println("Not a palindrome");
    	}
    	sc.close();
	}

}
