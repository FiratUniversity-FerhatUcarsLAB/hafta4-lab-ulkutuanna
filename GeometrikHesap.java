/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 2 - Geometrik Hesaplayıcı
 * 
 * Bu program kullanicidan daire yarıcap uzunluğunu alır ve alanı, çevresi çapını ve kürenin hacmini, yüzey alanını hesaplar.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */
import java.util.Scanner;

public class GeometrikHesap {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Dairenin yaricapini giriniz: ");
            double yaricap = input.nextDouble();
            
            final double PI = 3.14;
            
            double alan = PI * yaricap * yaricap;
            double cevre = 2 * PI * yaricap;
            double cap = 2 * yaricap;
            double hacim = (4.0 / 3.0) * PI * yaricap * yaricap * yaricap;
            double yuzeyAlani = 4 * PI * yaricap * yaricap;
            
            System.out.println("\n === GEOMETRIK HESAPLAR ===");
            System.out.printf("Yaricap: %.2f\n", yaricap);
            System.out.printf("Dairenin Alani: %.2f\n", alan);
            System.out.printf("Dairenin Cevresi: %.2f\n", cevre);
            System.out.printf("Dairenin Capi: %.2f\n", cap);
            System.out.printf("Kurenin Hacmi: %.2f\n", hacim);
            System.out.printf("Kurenin Yuzey Alani: %.2f\n", yuzeyAlani);
        }
  }

}
