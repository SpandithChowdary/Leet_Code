package LCProblems;
import java.util.*;
public class Roman_to_int_Array {
	    public static int romanToInt(String s) {
	    	       int[] values = new int[256];
	    	        values['I'] = 1;
	    	        values['V'] = 5;
	    	        values['X'] = 10;
	    	        values['L'] = 50;
	    	        values['C'] = 100;
	    	        values['D'] = 500;
	    	        values['M'] = 1000;

	    	        int sum = 0;
	    	        for(int i=0; i< s.length(); i++){
	    	            int current = values[s.charAt(i)];
	    	            int next = (i<s.length()-1)? values[s.charAt(i+1)] : 0;
	    	            if(current<next){
	    	                sum-=current;
	    	            }else{
	    	                sum+=current;
	    	            }
	    	        }
	    	        return sum;
	    }
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.next();
	    	int result = romanToInt(s);
	    	System.out.println("Roman-> "+s+" to Int-> "+result);
	    	sc.close();
	    }
	}
