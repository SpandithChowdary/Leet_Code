package LCProblems;

import java.util.Scanner;

public class Longest_common_Prefix {
	public static String longestCommonPrefix(String[] strs) {
	        String prefix = strs[0];
	        for(int i=1;i<strs.length;i++){
	           while(strs[i].indexOf(prefix)!=0){
	            prefix = prefix.substring(0,prefix.length()-1);
	            if(prefix.isEmpty()){
	                return "";
	            }
	           }
	        }
	        return prefix;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
    	String[] s = new String[size];
    	for(int i=0;i<size;i++) {
    		s[i]=sc.next();
    	}
    	String result = longestCommonPrefix(s);
    	System.out.println("Longest common Prefix : "+result);
    	sc.close();
	}

}
