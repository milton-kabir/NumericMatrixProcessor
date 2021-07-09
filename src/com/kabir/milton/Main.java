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
                    "4. Transpose matrix\n" +
                    "5. Calculate a determinant\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            int ck=sc.nextInt();
            if(ck==0){
                break;
            }
            if(ck==5){
                int m1,m2,n2,n1;
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
                System.out.println("The result is:");
                System.out.println(matrixDeterminant(ar));

            }
            else if(ck==4){
                System.out.println("1. Main diagonal\n" +
                        "2. Side diagonal\n" +
                        "3. Vertical line\n" +
                        "4. Horizontal line");
                System.out.println("Your choice:");
                int ck1=sc.nextInt();
                int m1,m2,n2,n1;
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
                double[][] res=new double[m1][n1];
                if(ck1==1){
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            res[i][j]=ar[j][i];
                        }
                    }
                }
                else if(ck1==2){
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            res[i][j]=ar[m1-1-j][n1-1-i];
                        }
                    }
                }
                else if(ck1==3){
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            res[i][j]=ar[i][n1-1-j];
                        }
                    }
                }
                else{
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            res[i][j]=ar[m1-1-i][j];
                        }
                    }
                }
                for(int i=0;i<m1;i++){
                    for(int j=0;j<n1;j++){
//                        ar[i][j]+=br[i][j];
                        System.out.print(res[i][j]+" ");
                    }
                    System.out.println();
                }

            }
            else if(ck==1){
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
    public static double matrixDeterminant (double[][] matrix) {
        double temporary[][];
        double result = 0;

        if (matrix.length == 1) {
            result = matrix[0][0];
            return (result);
        }

        if (matrix.length == 2) {
            result = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
            return (result);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            temporary = new double[matrix.length - 1][matrix[0].length - 1];

            for (int j = 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = matrix[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }

            result += matrix[0][i] * Math.pow(-1, (double) i) * matrixDeterminant(temporary);
        }
        return (result);
    }
}
