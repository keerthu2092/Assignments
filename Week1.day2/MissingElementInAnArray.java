package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
        int[] array1 = {1,2,3,4,7,6,8};
		Arrays.sort(array1);
        for(int i=0;i<array1.length-1;i++)
        {
            if(array1[i]+1!=array1[i+1])
            {
                System.out.println(array1[i]+1);
                break;
            }
        }
    }
}
	

