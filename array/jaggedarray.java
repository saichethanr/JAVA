package array;

public class jaggedarray {
    public static void main(String[] args) 
	{
		int nums[][]=new int [3][]; //jagged
		nums[0]=new int [3];
		nums[1]=new int [4];
		nums[2]=new int [2];
		
	   //the no of rows are defined but the no of columns are not hence 
       //for each row defined we need to allocate a new array
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
			}
		}
	}
}
