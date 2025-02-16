package LCProblems;
import java.util.*;
public class Roman_to_int_SwitchCase {
	    public static int romanToInt(String s) {
	    	        if (s == null || s.length() == 0) return 0; 
	    	        int sum = 0;
	    	        int prev =0;
	    	        for(int i=s.length()-1;i>=0; i--){
	    	            int current = values(s.charAt(i));
	    	            if(current<prev){
	    	                sum-=current;
	    	            }else{
	    	                sum+=current;
	    	            }
	    	            prev = current;
	    	        }
	    	        return sum ;
	    		}
	    static private int values(char c){
	        switch(c){
	            case 'I': return 1;
	            case 'V': return 5;
	            case 'X': return 10;
	            case 'L': return 50;
	            case 'C': return 100;
	            case 'D': return 500;
	            case 'M': return 1000;
	            default: throw new IllegalArgumentException("Invalid Roman numeral: "+ c);
	        }
	    }
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.next();
	    	int result = romanToInt(s);
	    	System.out.println("Roman-> "+s+" to Int-> "+result);
	    	sc.close();
	    }
	}
