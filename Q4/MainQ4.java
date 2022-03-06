package Q4;

import java.util.Scanner;

public class MainQ4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter X number");
        int X=scanner.nextInt();
        System.out.println("please enter N number");
        int N=scanner.nextInt();
        double result=0;
        for (int i=1;i<=N;i++){

            if(i%2==1){
                result+=-Math.pow(X,i*2)/factorial(i);
            }
            if(i%2==0){
                result+=Math.pow(X,i*2)/factorial(i);
            }

        }
        System.out.println(result);


    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }



}
