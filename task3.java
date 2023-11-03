import java.util.Scanner;
public class task3 {
    public static void main(String[]  args) {
        Scanner SC = new  Scanner(System.in);
        System.out.println("masukan tanggal lahir kamu!");
        int tanggal = SC.nextInt();
        System.out.println("kamu lahin bulan berapa?");
        int bulan = SC.nextInt();

        String zodiac = "";

        switch (bulan){
            case 1:
                zodiac =(tanggal <=19) ? "capicorn" : "aquarius";
                break;
            case 2:
                zodiac =(tanggal <=18) ? "aquarius" : "pisces";
                break;
            case 3:
                zodiac =(tanggal <=19) ? "pisces" : "taurus";
                break;
            case 4:
                zodiac =(tanggal <=20) ? "taurus" : "gemini";
                break;
            case 5:
                zodiac =(tanggal <=22) ? "gemini" : "cancer";
                break;
            case 6:
                zodiac =(tanggal <=20) ? "cancer" : "leo";
                break;
            case 7:
                zodiac =(tanggal <=19) ? "leo" : "virgo";
                break;
            case 8:
                zodiac =(tanggal <=20) ? "virgo" : "aries";
                break;
            case 9:
                zodiac =(tanggal <=22) ? "aries" : "sagitarius";
                break;
            case 10:
                zodiac =(tanggal <=19) ? "sagitarius" : "libra";
                break;
            case 11:
                zodiac =(tanggal <=20) ? "libra" : "skorpio";
                break;
            case 12:
                zodiac =(tanggal <=22) ? "skorpio" : "capicor";
                break;
        }
    }
}
