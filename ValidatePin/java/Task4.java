/*NAMA : WAHYU OZORAH MANURUNG
NPM: G1A022060
KELAS B2
*/
package ValidatePin.java; //PACKAGE

import java.util.Scanner; //memanggil impor package yang membaca masukan pengguna
public class Task4 {

	 public static void main(String[] args) { 
	        Scanner input= new Scanner (System.in); //membca teks yang dimasukan pengguna
	        int Pin= 123456;  //PIN yang akan menjadi acuan untuk masuk
	        int pass; // membuat variabel pass untuk menyimpan data dari user ketika mengisi inputan dalam bentuk integer 
	        boolean masuk = false; //kondisi awal jika data yang dimasukan salah, sehingga status keberhasilan disimpan
	       
	        System.out.println("Enter Your PIN: "); //user memasukan PIN 
	        while(!masuk) { //pengulangan yang mengulang sampai sukses sesuai yang diminta soal
	         pass= input.nextInt(); //menyimpan masukan pengguna ke tipe data
	        
	        if(pass == Pin) { // kondisi jika user memasukan data tadi sama dengan PIN yang telah dibuat
	        	    System.out.println("Your PIN correct"); // akan diesekusi langsung 
	        masuk=true; // mengubah nilai dari masuk tadi menjadi tru sehingga while loop akan berakhir 
	        	    
	        } else { // ini adalah jika pengguna memasukan data yang salah
	        	System.out.println("Enter Your Pin Again"); // dan akan mengesekusi ini, user pun akan memasukan PIN sampai benar
	           
	        }   
	        }}}

          
        
        
        
            
        
            
           
   
