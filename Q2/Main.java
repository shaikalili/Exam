package Q2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [][] mainMat=new int[40][40];
        int [][] subMat=new int[10][10];
        int[][] array={
                {1,2,0,8},
                {4,5,6,2},
                {7,8,9,2},
                {2,3,5,6}
        };
        int [][]array2= {
                {4,5,6},
                {7,8,9}
        };
        /*for(int i=0;i<mainMat.length;i++){
          for(int j=0;j<mainMat.length;j++){
              mainMat[i][j]=j+1;
          }
      }

        for(int i=0;i<subMat.length;i++){
            for(int j=0;j<subMat.length;j++){
               subMat[i][j]=j+1;
            }
        }*/
        System.out.println(Arrays.deepToString(mainMat));
        System.out.println(Arrays.deepToString(subMat));
        if(isArraysMatch(array,array2))
        System.out.println("we have a match");
        else
            System.out.println("we dont have a match");

    }

    public static boolean isArraysMatch(int [][] big,int [][] small) {
        int bigRaw = big.length;
        int bigCol = big[0].length;
        int smallRaw = small.length; 
        int smallCol = small[0].length;

        int flag = 0;

        for(int i=0; i<=(bigRaw - smallRaw); i++)
        {
            for(int j=0; j<=(bigCol- smallCol); j++)
            {
                flag=0;
                for(int p=0; p< smallRaw; p++)
                {
                    for(int q = 0; q< smallCol; q++)
                    {
                        if(big[i+p][j+q] != small[p][q])
                        {
                            flag=1;break;
                        }
                    }
                }
                if(flag==0)
                    break;
            }
            if(flag==0)
                break;
        }
      return flag==0?true:false;
    }
}
