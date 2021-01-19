import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2 != 0){
            System.out.println("Weird");
        }
        else{ 
            if(N>1 && N<6){
            System.out.println("Not Weird");
        }
        else if(N>7 && N<=20){
            System.out.println("Weird");
        }
        else if(N>20){
            System.out.println("Not Weird");
        }
        }
        scanner.close();
    }
}
