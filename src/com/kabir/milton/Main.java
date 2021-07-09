package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1. Add matrices\n" +
                    "2. Multiply matrix by a constant\n" +
                    "3. Multiply matrices\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            int ck=sc.nextInt();
            if(ck==0){
                break;
            }
            if(ck==1){
                int m1,m2,n2,n1;
                System.out.println("Enter size of first matrix:");
                m1=sc.nextInt();
                n1= sc.nextInt();
                System.out.println("Enter first matrix:");
                double [][] ar=new double [m1][n1];
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
                        ar[i][j]=sc.nextDouble();
                    }
                }
                System.out.println("Enter size of second matrix:");
                m2=sc.nextInt();
                n2= sc.nextInt();
                System.out.println("Enter second matrix:");
                double[][] br=new double [m2][n2];
                for(int i=0;i<m2;i++){
                    for(int j=0;j<n2;j++){
                        br[i][j]=sc.nextDouble();
                    }
                }
                if(m1!=m2||n1!=n2){
                    System.out.println("The operation cannot be performed.");
                    continue;
                }
                System.out.println("The result is:");
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
                        ar[i][j]+=br[i][j];
//                        System.out.print(ar[i][j]+" ");
                    }
//                    System.out.println();
                }
                if(ar==null){
                    System.out.println("The operation cannot be performed.");
                    continue;
                }
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
//                        ar[i][j]+=br[i][j];
                        System.out.print(ar[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else if(ck==2){
                int m1,n1;
                System.out.println("Enter size of matrix:");
                m1=sc.nextInt();
                n1= sc.nextInt();
                System.out.println("Enter matrix:");
                double [][] ar=new double [m1][n1];
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
                        ar[i][j]=sc.nextDouble();
                    }
                }
                System.out.println("Enter constant:");
                double x=sc.nextDouble();
                System.out.println("The result is:");
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
                        ar[i][j]*=x;
//                        System.out.print(ar[i][j]+" ");
                    }
//                    System.out.println();
                }
                if(ar==null){
                    System.out.println("The operation cannot be performed.");
                    continue;
                }
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
//                        ar[i][j]+=br[i][j];
                        System.out.print(ar[i][j]+" ");
                    }
                    System.out.println();
                }

            }
            else{
                int m1,m2,n2,n1;
                System.out.println("Enter size of first matrix:");
                m1=sc.nextInt();
                n1= sc.nextInt();
                System.out.println("Enter first matrix:");
                double [][] ar=new double [m1][n1];
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
                        ar[i][j]=sc.nextDouble();
                    }
                }
                System.out.println("Enter size of second matrix:");
                m2=sc.nextInt();
                n2= sc.nextInt();
                System.out.println("Enter second matrix:");
                double[][] br=new double [m2][n2];
                for(int i=0;i<m2;i++){
                    for(int j=0;j<n2;j++){
                        br[i][j]=sc.nextDouble();
                    }
                }
                if(n1!=m2){
                    System.out.println("The operation cannot be performed.");
                    continue;
                }
                double [][] res=new double [m1][n2];
                System.out.println("The result is:");
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n2;j++){
                        res[i][j]=0;
                        for(int k=0;k<m2;k++){
                            res[i][j]+=ar[i][k]*br[k][j];
                        }
//                        System.out.print(re+" ");
                    }
//                    System.out.println();
                }
                if(ar==null){
                    System.out.println("The operation cannot be performed.");
                    continue;
                }
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n2;j++){
//                        ar[i][j]+=br[i][j];
                        System.out.print(res[i][j]+" ");
                    }
                    System.out.println();
                }

            }
        }
    }
}
