import  java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eventCount = 0;
        int oddCount = 0;

        System.out.println("PROGRAM MENGHITUNG BILANGAN GENAP GANJIL.");
        System.out.println("MASUKAN BILANGAN BULAT POSITIF (angka negatif untuk keluar):");

        while (true) {
            int num = input.nextInt();

            if (num < 0) {
                System.out.println("TERIMA KASIH! PROGRAM SELESAI");
                break;
            }

            if (num % 2 == 0) {
                eventCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Jumblah bilangan genap: " + eventCount);
        System.out.println("jumblah bilangan ganjil: " + oddCount);
    }
}