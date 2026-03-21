package Besant.workouts;

//import java.util.Arrays;

//import java.util.Scanner;
//11-3-2026 Wednesday
public class Week2_Day3 {

	public static void main(String[] args) {
/*//String Anagram 
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
*/
		//Scanner Class intro
		/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		*/
//Pattern
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
	
}
