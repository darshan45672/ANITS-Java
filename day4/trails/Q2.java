package day4.trails;
import java.util.*;
//  Given an array of strings, return the longest common prefix.
public class Q2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
      int c=0;
      String str="";
      char ch1,ch2;
      for(int i=0;i<arr[0].length();i++){
        c=0;ch1=arr[0].toCharArray()[i];
        for(int j=0;j<n;j++){
            if(i>arr[j].length()-1){
                break;
            }
            ch2=arr[j].toCharArray()[i];
            if(ch1==ch2){
                c++;
            }
        }
        if(c==n){
            str+=ch1;
        }
        else{
            break;
        }
      }
        System.out.println(str);
    }    
}
