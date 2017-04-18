/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaseguimiento;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class TablaSeguimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b,z=0,c,m=0,n=0;
        System.out.println("Introduzca un numero");
        b=sc.nextInt();
        z=b;
        while(z>0){
            System.out.println("Escribe C");
            c=sc.nextInt();
            if(z==b){
            m=c;
            n=c;
            z=z-1;
            }
            if(z!=b){
                if(c>m){
                    m=c;
                    if(c>n){
                    n=c;
                    z=z-1;
                    }
                }
                if(c<=m){
                    if(c<=n){
                    z=z-1;
                    }
            
            }
                    
                    
            }
        
        }
        System.out.println("m="+m+"n="+n+"b="+b+"z="+z);
        
    }
    
}
