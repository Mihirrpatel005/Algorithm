package com.algo.test;

import java.util.Scanner;

public class Diangonal_sub {

	public static void main(String[] args) {
		  
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int a[][]= new int[n][n];
        int count=0;
           
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
            
        }
        int first=0, second=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==j){
                   first+=a[i][j];
               }   
            }
            
        }
        int m=0;
         for(int k=n-1;k>=0;k--){        
                   second+=a[k][m];
             m++;
        }
        System.out.print(Math.abs(first-second));
            

	}

}
