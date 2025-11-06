/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [04.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
    
        try (Scanner input = new Scanner(System.in)) {
    
            System.out.println("=== OGRENCI BILGI SISTEMI ===");
            
            System.out.print("Ad: ");
            String ad = input.nextLine();
            
            System.out.print("Soyad: ");
            String soyad = input.nextLine();
            
            System.out.print("Ogrenci Numarasi: ");
            int ogrNo = input.nextInt();
            
            System.out.print("Yas: ");
            int yas = input.nextInt();
            
            System.out.print("Genel Not Ortalamasi (0.00 - 4.00 arasi): ");
            double gpa = input.nextDouble();
            
            String durum;
            if (gpa >= 2.5) {
                durum = "Basarili Ogrenci";
            } else {
                durum = "Gelisim Gosteriyor";
            }
            System.out.println("\n=== OGRENCI BILGILERI ===");
            System.out.println("Ad: " + ad);
            System.out.println("Soyad: " + soyad);
            System.out.println("Ogrenci Numarasi: " + ogrNo);
            System.out.println("Yas: " + yas);
            System.out.printf("Genel Not Ortalamasi: %.2f\n", gpa);
            System.out.println("Durum: " + durum);
            
        }
    }
} 
