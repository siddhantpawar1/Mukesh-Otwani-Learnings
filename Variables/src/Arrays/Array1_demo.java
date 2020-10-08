package Arrays;

public class Array1_demo {

	public static void main(String[] args) {
	
	int First_array[]=new int[5];
	
	First_array[0]=89;
	First_array[1]=99;
	First_array[2]=119;
	First_array[3]=129;
	First_array[4]=139;
		
	int sizeofArray = First_array.length;
	System.out.println("length of array is :"+sizeofArray);
	
	for(int i=0;i<sizeofArray;i++)
	{
		System.out.println("Student marks are: "+First_array[i]);
	}
	}

}
