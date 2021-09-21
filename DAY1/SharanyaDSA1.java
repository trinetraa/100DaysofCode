//100 Days of GitHub
//Day 1 - 100 Days of GitHub</h1>
/*I'm really short on time but 100 Days of GitHub pumped me up to seriously start practicing a bit daily.
  I dozed off while doing it last night lol, but here goes Day 1!*/
 //DSA Questions on Java
 //Problem 1 - www.hackerrank.com/contests/july13/challenges/game-of-thrones/problem
 //My Solution

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SharanyaDSA1 {
public static String gameOfThrones(String s) {
    int count=0;int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;//for frequency calculation
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        if(count>1){
            return "NO";
            
        }
        else {
            return "YES";
        }
     
        }}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = W3PA.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
