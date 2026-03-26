package Besant.workouts;
import java.util.*;
public class ArrayConcepts {

	public static void main(String[] args) {

/*		
//1. Find Max element in Array
		int[] arr= {1,12,3,4,5};
		int max=arr[0];
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maxinum element of Array is:"+max);

------------------------------------
		
//2.Reverse an Array
		int[] arr= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

------------------------------------

//3. Find duplicaate element in array
		
		int[] arr= {1,2,2,3,4,4,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Found:"+arr[i]);
				}
			}
		}
------------------------------------

//4.Merge two sorted array insto one sorted array
		int[] a= {101,3,5,6};
		int[] b= {200,40,16};
		int[] c=new int[a.length+b.length];
		System.out.println("C Array length: "+c.length);
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]) {
                c[k++] = a[i++];
        
                
            } else {
                c[k++] = b[j++];
            }
        }

        while(i < a.length){
            c[k++] = a[i++];
        }

        while(j < b.length){
            c[k++] = b[j++];
        }
        System.out.println("Merged Array: "+ Arrays.toString(c));
--------------------------------------------------
*/
//5.Find the second largest element in Array
		int[] a= {1,20,3,4,5};
		int first_lar=a[0];
		for(int i=0;i<a.length;i++) {
			if(first_lar<a[i])
			{
				first_lar=a[i];
			}
			
		}
        System.out.println(first_lar);
        
        
        
        
        
        
        
        
        
        
        
        
     
    }
}

		
	
        		
