
package menurestaurant;

import java.util.Scanner;


public class MenuRestaurant {

    
    public static void main(String[] args) {
     
           //array 
       String[] menu = {"Soto", "Rendang", "Pecel", "Sate", "Nasi Goreng", "Bakso", "Ayam Bakar", "Es Teh", "Es Jeruk", "Es Campur"};
       int[] harga = {15000, 20000, 8000, 15000, 10000, 10000, 18000, 2500, 3000, 5000};
       
       System.out.println("Selamat Datang di Restoran Uenak");
       System.out.println("List Makanan");
       
        //perulangan
       for (int i = 0; i < harga.length; i++){
           System.out.println(i+". "+menu[i]+" => "+harga[i]);
           
       }       
        //scanner
       System.out.println("Silahkan masukkan nomor makanan ");
       
       Scanner input = new Scanner(System.in);
       
       int pilihan = input.nextInt();
       
       System.out.println("Silahkan masukkan nomor minuman ");
       
       int pilihan1 = input.nextInt();

       
       System.out.println("Makanan yang dipesan : "+menu[pilihan]+" dan "+menu[pilihan1]);
       
       //percabangan
       System.out.println("Silahkan masukkan uang anda ");
       
       int uang = input.nextInt();
       
       if (uang > harga[pilihan]+harga[pilihan1]){
           System.out.println("Kembalian "+(uang - harga[pilihan] - harga[pilihan1]));
       }else if (uang == harga[pilihan] + harga[pilihan1]){
           System.out.println("Uang pas, silahkan menunggu hidangan ");
       }else{
           System.out.println("Uang anda kurang "+(harga[pilihan] + harga[pilihan1] - uang));
       }
    }
    
}
 