/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package companyinsures;

import java.util.Scanner;

/**
 *
 * @author ayand
 */
public class CompanyInsures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // TODO code application logic here
    
    System.out.println("enter your gender");
    char gender = console.next().charAt(0);
    System.out.println("enter your marital status ");
    char status = console .next().charAt(0);
    System.out.println("enter your age");
    int age = console.nextInt();
    if (status=='m'){
    System.out.println("youre eligible ");
    }else if ( status =='u' && gender =='m'&& age>=30 ){
        System.out.println("youre eligible ");
        
    }else if (status== 'u' && gender =='f' && age >=25){
        System.out.println("toure eligible ");
    
    }else{
        System.out.println("youre not eligible ");
    }
        
        
        
        
    }
    
}
