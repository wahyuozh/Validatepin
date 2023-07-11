/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ValidatePin.java;

import java.util.Scanner;

public class Pasword {
	 public static void main(String[] args) {
	        Scanner input= new Scanner (System.in);
	        int Pin= 123456;  
	        int pass;
	        boolean masuk = false;
	       
	        System.out.println("Masukan Pin Anda: ");
	        while(!masuk) {
	         pass= input.nextInt();
	        
	        if(pass == Pin) {
	        	    System.out.println("Your PIN correct");
	        masuk=true;
	        	    
	        } else {
	        	System.out.println("Enter Your Pin Again");
	           
	        }   
	        }}}

