package Besant.workouts;

import java.util.Arrays;

public class Works {
	public static void main(String[] arg) {
/*
		//1.Swap two number using third variable.
		int a=10;
		int b=20;
		int c;
		System.out.println("Before Swap:"+a+" and "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap:"+a+" and "+b);

//2. *Check: given year is leap or not
		int year=2900;
		if ((year%4==0 && year %100 !=0)||(year%400==0) ){
			System.out.println("Given year is leap year");
		}else {
			System.out.println("Not a leap year");
		}

		
//3. *Even/Odd Check*: Check if a number is even or odd.
		int n=10;
		if(n%2==0)
		{
			System.out.println(n+" is Even");
		}else {
			System.out.println(n+" is Odd");
		}
	
//4. *Largest of Two Numbers*: Find the largest of two numbers.
		int n1=1000;
		int n2=1000;
		if (n1>n2) {
			System.out.println("N1 is Large");
		}else if(n2>n1) {
			System.out.println("N2 is Large");
		}else {
			System.out.println("N1 and N2 are Equal");
		}

//5. *Simple Interest Calculator*: Calculate simple interest.
		int prin_amt=1000;
		int rate=5;
		float year=2f;
		float si;
		si=(prin_amt*rate*year)/100;
		System.out.println("Simple Interest: "+si);

//6. *Area of Circle*: Calculate the area of a circle.
		double radius=5;
		double area;
		area=3.14*radius*radius;
		System.out.println("Area of Circle: "+ area);
		

//7. *Swap Two Numbers*: Swap two numbers without using a third variable.
		int x=10;
		int y=20;
		System.out.println("Before Swap:"+x+" and "+y);
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		System.out.println("After Swap:"+x+" and "+y);

//9. *Multiplication Table*: Print the multiplication table of a number.
        int start_point;
        int end_point=10;
		int table=3;
		for(start_point=1;start_point<=end_point;start_point++) {
			System.out.println(start_point+"*"+table+"="+(start_point*table));
		}

//10. *Sum of Digits*: Calculate the sum of digits of a number.
		int n=121;//4
		int mod;
		int sum=0;
		while(n>0){//121>0,12>0,2>0
			mod=n%10;//1.1, 2.2,3.
			sum=sum+mod;//1.1,2.3
			n=n/10;//12,2
			
		}
		System.out.println(sum);
		
*
//11.Prime Number Check*: Check if a number is prime.
		int num=4;
		int count=0;
		for (int i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(num +" is prime number");
		}else
		{
			System.out.println(num +" is not prime number");
		}

//12. *Fibonacci Series*: Print the Fibonacci series up to n terms.
		
		int first=0,second=1,num=5;
		for (int i=1;i<=5;i++) {
			System.out.println(first);
			int next=first+second;
			first=second;
			second=next;
		}
		

//14. *Armstrong Number Check*: Check if a number is an Armstrong number.

		int num=153;//1+125+27=153
		int org_num=num;
		int result=0;
		while (num!=0) {
			int remain=num%10;
			result=result+(remain*remain*remain);
			num=num/10;
		}if(org_num==result) {
			System.out.println(org_num+" is Armstrong Number");
		}else {
			System.out.println(org_num+ " is not a Armstrong Number");
		}

//15. *Perfect Number Check*: Check if a number is perfect (sum of divisors equals the number).
		int num=28,sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.println(i);// just my preference
			}
		}if(sum==num) {
			System.out.println(num+" is perfect number");
		}else {
			System.out.println(num+" is not a perfect number");
		}

//16. *Palindrome Number Check*: Check if a number is a palindrome.
		int num=121;
		int org_num=num;
		int rev=0;
		while(num>0) {
			int remain=num%10;
			rev=rev*10+remain;
			System.out.println(rev);
			num=num/10;
		}if(org_num==rev) {
			System.out.println(org_num+" is polindrome");
		}else {
			System.out.println(org_num+" is not a polindrome");
		}

//17. *Factorial Program*: Calculate the factorial of a number.
		int n=5,fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);

//18. *Reverse Number*: Reverse a given number.
		int num=1341;
		int org_num=num;
		int rev=0;
		while(num>0) {
			int remain=num%10;
			rev=rev*10+remain;
			
			num=num/10;
		}
		System.out.println("Original Number: "+org_num+"\nReverse Number: "+rev);

//19.*GCD of Two Numbers*: Calculate the GCD of two numbers.
		int n1=4,n2=10;
		int gcd=1;
		
		for(int i=1;i<=n1&&1<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
				gcd=i;
				
			}
		}
		System.out.println(n1+" and "+n2+" GCD is: "+gcd);

//20. *Automorphic Number Check*: Check if a number is automorphic (square ends with the number).

	   
		int num=4;
		int sqr=num*num;
		if(sqr%10 == num%10) {
			System.out.println(num+ " is automorphic number");
		}else {
			System.out.println(num+" is not automorphic number");
		}
*/
//String Anagram 
		String s1="Listen";
		String s2="Silent";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
	
		if(s1.length()==s2.length())
		{
			char[] s11=s1.toCharArray();
			char[] s22=s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			if(Arrays.equals(s11, s22)) {
				System.out.println(s1+" and "+s2+" are Anagram");
			}else {
				System.out.println("Not a Anagram, because diffrent characters");
			}
			
		}else {
			System.out.println("Not a Anagram, because Two String length not same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
