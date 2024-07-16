package array;

public class arr3d {
    public static void main(String[] args) {
        int nums[][]=new int [3][4];
        //		int nums[][]=new int [3][4][5]; // three dimensional
                
                for(int i=0;i<nums.length;i++)
                {
                    for(int j=0;j<nums[i].length;j++)
                    {
                        nums[i][j]=(int)(Math.random()*10);
                    }
                }
    }
}
