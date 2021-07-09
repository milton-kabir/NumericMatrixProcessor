package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int m1,m2,n2,n1;
        Scanner sc= new Scanner(System.in);
        m1=sc.nextInt();
        n1= sc.nextInt();
        int[][] ar=new int [m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        m2=sc.nextInt();
        n2= sc.nextInt();
        int[][] br=new int [m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                br[i][j]=sc.nextInt();
            }
        }

        if(m1!=m2||n1!=n2){
            System.out.println("ERROR");
            return;
        }
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                ar[i][j]+=br[i][j];
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }


    }
}
