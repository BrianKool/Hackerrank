package hackerrank;


import java.util.Scanner;

public class Hacker {

    static int findFreq(String a, char c){
        int result = 0;
        if (a.indexOf(c) >= 0){ 
            for (int i = 0; i < a.length(); i ++){
                if (a.charAt(i) == c){
                    result ++;
                }
            }
        }
            return result;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	
        if (a.length() == b.length()){
            for (int i = 0; i < a.length(); i ++){
                 if(findFreq(a, a.charAt(i)) == findFreq(b, a.charAt(i))){
                 }else {
                	 return false;
                 }
            }return true;
        }return false;
    }

    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
