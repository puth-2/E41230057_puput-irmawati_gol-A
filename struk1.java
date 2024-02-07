
package acaram2;

import java.util.Scanner;
import java.util.ArrayList;

public class struk1 {
   
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("          Kharisma Agung Plaza <KAP>               ");
        System.out.println("           Promo Belanja Berhadiah                 ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama           ");
        System.out.println("        Dengan Harga Minimum Rp 10000,00           ");
        System.out.println("===================================================");
        System.out.print("Masukkan nama pembeli : ");
        String nama;
         int result=0;
        nama = masukkan.nextLine();
        
        for (int i = 0; i < 5; i++){
            System.out.print("Masukkan Harga Barang Ke-" + (i+1) + " : ");
            result +=masukkan.nextInt();
        }
        System.out.println("Total Harga Pembeliaan Atas Nama "+ nama +" "+"adalah Rp"+ result);
        System.out.println("");
        
        if (result >= 10000) {
            System.out.println("selamat.....");
            System.out.println("Anda Mendapat Hadiah 1 Buah Mug Cnatik");
        }
        System.out.println("");
        
        System.out.println("===================================================");
        System.out.println("                     Terimakasih                   ");
        System.out.println("      Anda Berbelanja di Kharisma Agung Plaza      ");
    }
    
}
