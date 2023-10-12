package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int islem;
        float n1,n2,sonuc;

        System.out.print("1. sayıyı giriniz: ");
        n1 =input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        n2 =input.nextInt();
        System.out.print("Toplama için--(1) \n Çıkarma için--(2) \n Bölme için--(3) \n Çarpma için--(4)\n Tuşlayınız : ");
        islem =input.nextInt();

        switch(islem){
            case 1 : sonuc=n1+n2;
                System.out.println("Sonuç"+sonuc);
                break;
            case 2 : sonuc=n1-n2;
                System.out.println("Sonuç"+sonuc);
            case 3 : sonuc=n1/n2;
                if (n2 == 0) {
                    System.out.println("Sıfıra bölünmez!");
                    break;
                }
                System.out.println("Sonuç " + (sonuc));
                break;

            case 4 : sonuc=n1*n2;
                System.out.println("Sonuç"+sonuc);
                break;
            default: System.out.println("Yanlış tuşladınız");
        }



    }

}
