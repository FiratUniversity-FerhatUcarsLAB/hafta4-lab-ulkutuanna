/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [06.11.2025]
 * Aciklama: Gorev 3- Maaş Hesaplama Sistemi
 * 
 * Bu program kullanicidan çalışandan ad soyad, aylık brüt maaş, haftalık çalışma saati ve mesai saati bilgilerini alıp aylık maaşını hesaplar 
*/

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print ("Calisanin ad ve soyadini giriniz: ");
            String adSoyad = input.nextLine();
            
            System.out.print ("Aylik brut maas (TL): ");
            double brutMaas = input.nextDouble();
            
            System.out.print ("Haftalik calisma saati: ");
            
            System.out.print( "Mesai Saati sayisi:");
            int mesaiSaati = input.nextInt();
            
            final double SGK_ORANI = 0.14;
            final double VERGI_ORANI = 0.20;
            final double DAMGA_VERGİSİ_ORANI = 0.00759;
            final double AYLIK_SAAT = 160.0;
            final int IS_GUNU = 22;
            
            double mesaiUcreti =( brutMaas / AYLIK_SAAT) * 1.5 * mesaiSaati;
            double sgkKesintisi = brutMaas * SGK_ORANI;
            double toplamGelir= brutMaas + mesaiUcreti;
            double gelirVergisi = toplamGelir * VERGI_ORANI;
            double damgaVergisi = toplamGelir * DAMGA_VERGİSİ_ORANI;
            double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;
            double netMaas = toplamGelir - toplamKesinti;
            
            double saatlikNetKazanc = netMaas / ( AYLIK_SAAT + mesaiSaati);
            double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
            double gunlukNetKazanc = netMaas / IS_GUNU;
            
            System.out.println("\n=== MAAS HESAPLAMA SISTEMI ===");
            System.out.println("Calisan Adi Soyadi: " + adSoyad);
            System.out.printf("Brut Maas: %.2f TL\n", brutMaas);
            System.out.printf("Mesai Ucreti: %.2f TL\n", mesaiUcreti);
            System.out.printf("Toplam Gelir: %.2f TL\n", toplamGelir);
            
            System.out.println("\n--- KESINTILER ---\n");
            System.out.printf("SGK Kesintisi: %.2f TL\n", sgkKesintisi);
            System.out.printf("Gelir Vergisi: %.2f TL\n", gelirVergisi);
            System.out.printf("Damga Vergisi: %.2f TL\n", damgaVergisi);
            System.out.printf("Toplam Kesinti: %.2f TL\n", toplamKesinti);
            
            System.out.println ("\n--- NET MAAS ---\n");
            System.out.printf("Net Maas: %.2f TL\n", netMaas);
            System.out.printf("Saatlik Net Kazanc: %.2f TL\n", saatlikNetKazanc);
            System.out.printf("Kesinti Orani: %.2f %%\n", kesintiOrani);
            System.out.printf("Gunluk Net Kazanc: %.2f TL\n", gunlukNetKazanc);
        }

    }
}
