package Q1;

import Q1.ChainiesCitizen;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the name of the citizen and the id");
     ChainiesCitizen citizen=new ChainiesCitizen(scanner.next(), scanner.next());
     System.out.println(citizen);
    }


}

