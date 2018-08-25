/**
Program to to settle for an ideal transaction between 4 members.
 Made by Meet Dagar, BCA I-B
**/

package com.company;
import java.util.Scanner;

public class Main {

    //variables
    public static Integer array [][];
    public static Scanner scanner;
    public static int n;
    public static int m;
    public static int totalSpent, idealSpent;


    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        array = getData();

        printArray(array);

        System.out.println("\n\n");
        System.out.println("Here is how much each member has to give/take to settle for an ideal transaction.\n" +
                "A minus sign indicates the person owes money and has to give it in the opposite direction.");

        for(int i=0; i<n; i++){
            int x1, x2, x3, x4;

            totalSpent = calculateTotal(array,i);
            idealSpent = totalSpent/m;

            x1 = idealSpent - array[i][0];
            x2 = idealSpent - array[i][1];
            x3 = idealSpent - array[i][2];
            x4 = idealSpent - array[i][3];


            System.out.println("M1: {M2:"+x2+",M3:"+x3+",M4:"+x4+"}");
            System.out.println("M2: {M1:"+x1+",M3:"+x3+",M4:"+x4+"}");
            System.out.println("M3: {M2:"+x2+",M1:"+x1+",M4:"+x4+"}");
            System.out.println("M4: {M2:"+x2+",M3:"+x3+",M1:"+x1+"}");

            System.out.println("\n\n");
        }

    }

    public static Integer [][] getData(){
        //no. of transactions
        System.out.println("Enter the no. of transactions.");
        n = scanner.nextInt();

        //no. of members
        m = 4;

        Integer arrayList [][] = new Integer[n][4];

        System.out.println("Enter the contributions made by the 4 members respectively");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arrayList[i][j] = scanner.nextInt();
            }
        }

        return arrayList;
    }

    public static void printArray(Integer arrayList [][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arrayList[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int calculateTotal(Integer arrayList [][], int i){
        int sum = 0;

        for(int j=0;j<m;j++){
            sum = sum + arrayList[i][j];
        }

        return sum;
    }

}




