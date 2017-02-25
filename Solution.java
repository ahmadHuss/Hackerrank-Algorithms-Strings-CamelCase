import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
	int check =1;
		int length = s.length();
		
		for(int i=0;i<length;i++){
			/*
			 * ASCII Behind these letters
			 * UpperCase A-Z 65-90
			 * LOWERCASE a-z 97-122
			 */
		       if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
		    	   check++;
		       }
		}
		System.out.println(check);
		
		

	
	}

}