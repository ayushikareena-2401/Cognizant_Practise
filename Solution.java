// Section 1: Programming Using Java

// Non-Repeated Digits Count

import java.io.*;
import java.util.*;

/*
class Solution {
 public static int check(int n) {
   int ans=0;
   int[] arr = new int[10];
   while(n>0) {
     arr[n%10]++;
     n/=10;
   }
   for(int i=0;i<arr.length;i++) {
     if(arr[i]==1) {
      ans++;
     }
   }
   return ans;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number you want to process:");
   int n=sc.nextInt();
   System.out.println("The number of unique digits in the given number is: "+check(n));
 }
}
*/

// Sum of Unique Digits

/*
class Solution {
 public static int check(int n) {
   int ans=0;
   int[] arr = new int[10];
   while(n>0) {
     arr[n%10]++;
     n/=10;
   }
   for(int i=0;i<arr.length;i++) {
     if(arr[i]==1) {
      ans+=i;
     }
   }
   return ans;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number you want to process:");
   int n=sc.nextInt();
   System.out.println("The sum of unique digits in the given number is: "+check(n));
 }
}
*/

//Weight of a hill pattern

/*
class Solution {
 public static int calculate(int n,int n1,int n2) {
   int ans=n1;
   for(int i=2;i<=n;i++) {
      ans+=(i*(n2*((i-1)+n1)));
   }
   return ans;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of rows in the hill:");
   int n=sc.nextInt();
   System.out.println("Enter the weight of the first row of the hill:");
   int n1=sc.nextInt();
   System.out.println("Enter the additional weights for the consecutive rows of the hill:");
   int n2=sc.nextInt();
   System.out.println("The weight of the hill is: "+calculate(n,n1,n2));
 }
}
*/

//Nth Fibonacci

/*
class Solution {
 public static int fibo(int n) {
   if(n==0) {
     return 0;
   } else if(n==1){
     return 1;
   }
   int num1=0;
   int num2=1,num3=0;
   for(int i=2;i<n;i++) {
      num3=num1+num2;
      num1=num2;
      num2=num3;
   }
   return num3;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the term which you want from the fibonacci series:");
   int n=sc.nextInt();
   System.out.println("The required term of fibonacci series is: "+fibo(n));
 }
}
*/

//pCreate PIN using three given input numbers

/*
class Solution {
 public static int pin(int n1,int n2,int n3) {
   int[] arr1 = new int[3];
   int[] arr2 = new int[3];
   int[] arr3 = new int[3];
   int max=Integer.MIN_VALUE;
    arr3[0]=n1%10;
    max=max>=n1%10?max:n1%10;
    n1/=10;
    arr2[0]=n1%10;
    max=max>=n1%10?max:n1%10;
    n1/=10;
    arr1[0]=n1%10;
    max=max>=n1%10?max:n1%10;
    n1/=10;
    arr3[1]=n2%10;
    max=max>=n2%10?max:n2%10;
    n2/=10;
    arr2[1]=n2%10;
    max=max>=n2%10?max:n2%10; 
    n2/=10;
    arr1[1]=n2%10;
    max=max>=n2%10?max:n2%10;
    n2/=10;
    arr3[2]=n3%10;
    max=max>=n3%10?max:n3%10;
    n3/=10;
    arr2[2]=n3%10;
    max=max>=n3%10?max:n3%10;
    n3/=10;
    arr1[2]=n3%10;
    max=max>=n3%10?max:n3%10;
    n3/=10;
    int ans=0;
    ans+=max*1000;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    Arrays.sort(arr3);
    ans+=arr1[0]*100;
    ans+=arr2[0]*10;
    ans+=arr3[0];
   return ans;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number:");
   int n1=sc.nextInt();
   System.out.println("Enter the second number:");
   int n2=sc.nextInt();
   System.out.println("Enter the third number:");
   int n3=sc.nextInt();
   System.out.println("The generated PIN is: "+pin(n1,n2,n3));
 }
}
*/

//Consecutive Sum

class Solution {
 public static List<List<Integer>> op(int n) {
   List<List<Integer>> l= new ArrayList<>();
   for(int i=1;i<=n;i++) {
    ArrayList<Integer> list = new ArrayList<>();
    int sum=0;
    for(int j=i;sum<n;j++) {
      sum+=j;
      list.add(j);
      if(sum==n) {
       l.add(list);
       break;
      }
   }
  }
   return l;
 }
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number whose consecutive sum you want to find out:");
   int n=sc.nextInt();
   System.out.println("The required list: ");
   List<List<Integer>> list = op(n);
   for(List<Integer> l:list ) {
    System.out.println(l);
  }
 }
}
