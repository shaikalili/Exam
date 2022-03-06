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
        int startRaw=0;
        int startCol=0;
        boolean find=false;

       while (!find) {
           for (int i = 0; i < big.length; i++) {
               for (int j = 0; j < big.length; j++) {
                   if (small[0][0] == big[i][j]) {
                       startRaw = i;
                       startCol = j;
                   }
               }
           }
           find=true;
           for (int i=startRaw,m=0; i< small.length; i++,m++) {
               for (int j=startCol,k=0; j < small.length; j++,k++) {
                   if (small[m][k] != big[i][j]) {
                       find=false;
                       break;
                   }
               }
           }
           if (find)
               return true;
       }
       return false;
    }
}
