package Q2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [][] mainMat=new int[40][40];
        int [][] subMat=new int[10][10];
        /*int[][] array={
                {1,2,0},{4,5,6},{7,8,9}
        };
        int [][]array2={
                {1,0,3},{4,5,6}
        };*/
      for(int i=0;i<mainMat.length;i++){
          for(int j=0;j<mainMat.length;j++){
              mainMat[i][j]=j+1;
          }
      }

        for(int i=0;i<subMat.length;i++){
            for(int j=0;j<subMat.length;j++){
               subMat[i][j]=j+1;
            }
        }
        System.out.println(Arrays.deepToString(mainMat));
        System.out.println(Arrays.deepToString(subMat));
        if(isArraysMatch(mainMat,subMat))
        System.out.println("we have a match");
        else
            System.out.println("we dont have a match");

    }

    public static boolean isArraysMatch(int [][] big,int [][] small) {
       for (int i=0;i< small.length;i++){
           for (int j=0;j< small.length;j++){
               if(small[i][j]!=big[i][j])
                   return false;
           }
       }

        return true;
    }
}
