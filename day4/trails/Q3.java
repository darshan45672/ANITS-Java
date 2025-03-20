package day4.trails;

// Given a string s, return the index of the first non-repeating character. If all characters repeat, return -1.

// Example:
// Input: "leetcode"
// Output: 0










import java.util.*;
public class Q3 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
char s[]=sc.next().toCharArray();
if(s.length==0) System.out.println("Empty String");
int ans=Integer.MAX_VALUE;
int c=0;
for(int i=0;i<s.length;i++){
    c=0;
    for(int j=i+1;j<s.length;j++){
        if(s[i]==s[j]){
            c=1;
            break;
        }
    }
    if(c==0){
        ans=Math.min(ans,i);
    }
}
if(ans==Integer.MAX_VALUE) {
System.out.println(-1);}
else {System.out.println(ans);}
}
}
