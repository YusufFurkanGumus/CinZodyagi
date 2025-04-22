import java.util.Scanner;

public class ÇinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int doğumyılı;
        System.out.println("ÇİN ZODYAĞI HESAPLAYICIYA HOŞ GELDİNİZ");

        System.out.println("Doğduğunuz Yılı Giriniz");
        doğumyılı = input.nextInt();
        System.out.println("Doğduğunuz Yıl :"+doğumyılı);

        int kalan = doğumyılı % 12;
        String zodyak = "";

        switch (kalan){
            case 0: zodyak = "Maymun"; break;
            case 1: zodyak = "Horoz"; break;
            case 2: zodyak = "Köpek"; break;
            case 3: zodyak = "Domuz"; break;
            case 4: zodyak = "Fare"; break;
            case 5: zodyak = "Öküz"; break;
            case 6: zodyak = "Kaplan"; break;
            case 7: zodyak = "Tavşan"; break;
            case 8: zodyak = "Ejderha"; break;
            case 9: zodyak = "Yılan"; break;
            case 10: zodyak = "At"; break;
            case 11: zodyak = "Koyun"; break;
        }
        System.out.println("Çin Zodyağı Burcunuz :"+zodyak);



    }
}
