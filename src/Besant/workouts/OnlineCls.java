package Besant.workouts;

public class OnlineCls {

	public static void main(String[] args) {
		int[] a= {101,5,6};
		int[] b= {200,40,16};
		int[] c=new int[a.length+b.length];
		
		int i = 0, j = 0, k = 0;

		 while(i < a.length && j < b.length){
	            if(a[i] < b[j]){
	            	System.out.println(k+" "+i);
	                c[k++] = a[i++];
	            	System.out.println(k+" "+i);
	                
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
	    }
		

	}


