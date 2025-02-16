package LCProblems;
import java.util.*;
public class Roman_to_int_hash {
	    public static int romanToInt(String s) {
	        HashMap<Character,Integer> map = new HashMap<>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        int sum=0 , prevValue = 0;
	        for(int i=s.length()-1; i>=0;i--){
	                int currentValue =map.get(s.charAt(i));
	                if(currentValue < prevValue){
	                    sum-=currentValue;
	                }else{
	                    sum+=currentValue;
	                }
	                prevValue = currentValue;
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
