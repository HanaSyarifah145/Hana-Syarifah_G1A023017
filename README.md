# Hana-Syarifah_G1A023017

1.1	Latar Belakang 
Pesatnya perkembangan teknologi membuat makin banyak pula aplikasi atau program yang digunakan untuk membantu masyarakat. Bukan hanya aplikasi produktif saja, aplikasi hiburan seperti Games juga terus bertumbuhan. Semua aplikasi atau program tersebut dibuat dan dikembangkan menggunakan bahasa pemrograman yang berbeda. Meskipun menggunakan beragam bahasa yang berbeda, namun cara berpikir atau algoritmanya akan tetap sama.
Sementara itu, pemrograman adalah proses mengembangkan program, perangkat lunak komputer, aplikasi, dan situs web (Tim Kemdikbud, 2021, hlm. 195). Saat ini, komputer tidak dapat berpikir sendiri. Komputer hanya menjalankan perintah yang diberikan kepadanya atau yang sudah tersimpan dan siap dijalankan. Komputer meminta pengguna untuk memberi serangkaian instruksi yang diperintahkan untuk mengetahui apa yang harus dilakukan. Perintah yang dipahami oleh komputer disebut sebagai “kode”, oleh karena itu terkadang pemrograman juga disebut dengan coding (mengode).

1.2	Rumusan masalah 
1.	Bagaimana cara menerapkan if, else, dan array ?
2.	Kendala apa yang di dapat saat melakukan pemrograman menggunakan aplikasi ?

1.3	Tujuan 
1.	Untuk mengetahui bagaimana cara menggunakan if, else, dan array.
2.	Untuk mengetahui kendala apakah yang sering dihadapi saat melakukan pemrograman menggunakan aplikasi.

1.4	Manfaat
1.	Mengetahui penggunaan if, else, dan array.
2.	Mengetahui aplikasi yang cocok dengan pengguna.
A. Aplikasi Coding
	Untuk memulai coding, ada banyak aplikasi yang dapat Anda gunakan. Berikut adalah beberapa aplikasi yang dapat Anda pertimbangkan:
1.	Visual Studio Code: Aplikasi ini dapat digunakan pada Windows, macOS, dan Linux. Visual Studio Code memiliki tampilan yang sederhana dan mudah digunakan. Selain itu, aplikasi ini juga mendukung banyak bahasa pemrograman dan memiliki banyak fitur yang berguna seperti debugging, Git, dan lain-lain. 
2.	Sublime Text: Aplikasi ini juga dapat digunakan pada Windows, macOS, dan Linux. Sublime Text memiliki performa yang maksimal dan tampilan yang beragam namun tetap sederhana. Aplikasi ini juga dapat Anda gunakan secara gratis dengan jangka waktu tertentu. Untuk mendapatkan fitur yang lengkap, Anda harus mengeluarkan biaya berkisar 70 US Dollar. Sublime Text cukup mudah digunakan, sekali pun pada perangkat dengan resource yang terbatas. Aplikasi yang memiliki banyak plugins ini sangat cocok bagi programmer, khususnya web developer. 
3.	Notepad++: Aplikasi ini cukup familiar di telinga programmer. Notepad++ dapat digunakan pada Windows dan memiliki banyak fitur yang berguna seperti syntax highlighting, auto-completion, dan lain-lain. Selain itu, aplikasi ini juga mendukung banyak bahasa pemrograman. 
4.	IntelliJ IDEA memiliki banyak fitur yang berguna seperti debugging, Git, dan lain-lain. Selain itu, aplikasi ini juga mendukung banyak bahasa pemrograman dan memiliki banyak plugin yang dapat membantu Anda dalam pengembangan aplikasi. IntelliJ IDEA juga memiliki fitur Deep Code Understanding yang memungkinkan Anda untuk menavigasi kode dengan cepat dan memberikan saran yang relevan dalam setiap konteks.
Pada pemrograman kali ini saya menggunakan IntelliJ IDEA, menurut saya IntelliJ IDEA sangat mudah di gunakan terutama oleh pemula.

B. Soal dan Pembahasan
1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
Ans:
public class task1 {
    public static void main(String[] args){
        String name = "Hana Syarifah";
        String NPM = "G1A023017";
        System.out.println("Nama : " + name);
        System.out.println("NPM : " + NPM);
        System.out.println("===============");
        for(int i = 1; i<=100; i++){
            if (i>=10){
                System.out.println(name);
            } else {
                System.out.println(i);
            }
        }
    }
}
 
penjelasan kode:
1.	public class task1 {: Mendefinisikan kelas task1 yang dapat diakses oleh kelas lain.
2.	public static void main(String[] args){: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
3.	String name = "Hana Syarifah";: Mendefinisikan variabel name dengan tipe data String dan memberikan nilai awal "Hana Syarifah".
4.	String NPM = "G1A023017";: Mendefinisikan variabel NPM dengan tipe data String dan memberikan nilai awal "G1A023017".
5.	System.out.println("Nama : " + name);: Menampilkan teks "Nama : " diikuti dengan nilai variabel name.
6.	System.out.println("NPM : " + NPM);: Menampilkan teks "NPM : " diikuti dengan nilai variabel NPM.
7.	System.out.println("===============");: Menampilkan garis pemisah.
8.	for(int i = 1; i<=100; i++){: Memulai perulangan dari 1 hingga 100.
9.	if (i>=10){: Jika nilai i lebih besar atau sama dengan 10, maka jalankan baris kode berikutnya.
10.	System.out.println(name);: Menampilkan nilai variabel name.
11.	} else {: Jika nilai i kurang dari 10, maka jalankan baris kode berikutnya.
12.	System.out.println(i);: Menampilkan nilai i.
13.	}: Menutup blok if-else.
14.	}: Menutup blok perulangan for.
2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while.
Ans:
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
Penjelasan kode:
1.	import java.util.Scanner;: Mendeklarasikan package java.util.Scanner yang digunakan untuk membaca input dari pengguna.
2.	public class task2 {: Mendefinisikan kelas task2 yang dapat diakses oleh kelas lain.
3.	public static void main(String[] args) {: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
4.	Scanner input = new Scanner(System.in);: Membuat objek input dari kelas Scanner untuk membaca input dari pengguna.
5.	int eventCount = 0;: Mendefinisikan variabel eventCount dengan tipe data int dan memberikan nilai awal 0.
6.	int oddCount = 0;: Mendefinisikan variabel oddCount dengan tipe data int dan memberikan nilai awal 0.
7.	System.out.println("PROGRAM MENGHITUNG BILANGAN GENAP GANJIL.");: Menampilkan teks "PROGRAM MENGHITUNG BILANGAN GENAP GANJIL.".
8.	System.out.println("MASUKAN BILANGAN BULAT POSITIF (angka negatif untuk keluar):");: Menampilkan teks "MASUKAN BILANGAN BULAT POSITIF (angka negatif untuk keluar):".
9.	while (true) {: Memulai perulangan tak terbatas.
10.	int num = input.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel num.
11.	if (num < 0) {: Jika nilai num kurang dari 0, maka jalankan baris kode berikutnya.
12.	System.out.println("TERIMA KASIH! PROGRAM SELESAI");: Menampilkan teks "TERIMA KASIH! PROGRAM SELESAI" dan mengakhiri program.
13.	break;: Keluar dari perulangan.
14.	}: Menutup blok if.
15.	if (num % 2 == 0) {: Jika nilai num habis dibagi 2, maka jalankan baris kode berikutnya.
16.	eventCount++;: Menambahkan nilai variabel eventCount sebesar 1.
17.	} else {: Jika nilai num tidak habis dibagi 2, maka jalankan baris kode berikutnya.
18.	oddCount++;: Menambahkan nilai variabel oddCount sebesar 1.
19.	}: Menutup blok if-else.
20.	}: Menutup blok perulangan while.
21.	System.out.println("Jumblah bilangan genap: " + eventCount);: Menampilkan teks "Jumblah bilangan genap: " diikuti dengan nilai variabel eventCount.
22.	System.out.println("jumblah bilangan ganjil: " + oddCount);: Menampilkan teks "jumblah bilangan ganjil: " diikuti dengan nilai variabel oddCount.


3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan.
Ans:
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
Penjelasan kode:
1.	import java.util.Scanner;: Mendeklarasikan package java.util.Scanner yang digunakan untuk membaca input dari pengguna.
2.	public class task3 {: Mendefinisikan kelas task3 yang dapat diakses oleh kelas lain.
3.	public static void main(String[] args) {: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
4.	Scanner SC = new Scanner(System.in);: Membuat objek SC dari kelas Scanner untuk membaca input dari pengguna.
5.	System.out.println("masukan tanggal lahir kamu!");: Menampilkan teks "masukan tanggal lahir kamu!".
6.	int tanggal = SC.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel tanggal.
7.	System.out.println("kamu lahin bulan berapa?");: Menampilkan teks "kamu lahir bulan berapa?".
8.	int bulan = SC.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel bulan.
9.	String zodiac = "";: Mendefinisikan variabel zodiac dengan tipe data String dan memberikan nilai awal "".
10.	switch (bulan){: Memulai blok switch dengan variabel bulan sebagai kondisi.
11.	case 1:: Jika nilai bulan sama dengan 1, maka jalankan baris kode berikutnya.
12.	zodiac =(tanggal <=19) ? "capicorn" : "aquarius";: Jika nilai tanggal kurang dari atau sama dengan 19, maka nilai variabel zodiac adalah "capicorn". Jika tidak, maka nilai variabel zodiac adalah "aquarius".
13.	break;: Keluar dari blok switch.
14.	Dan seterusnya
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.
Ans:
public class task4 {
    public static void main(String[] args){
        String[] jajan = {
                "es teh", "cimol", "cilok", "batagor", "siomai"
        };
        for (int i=0; i< jajan.length; i++) {
            System.out.println(jajan[i]);
        }

    }
}
Penjelasan kode:
1.	public class task4 {: Mendefinisikan kelas task4 yang dapat diakses oleh kelas lain.
2.	public static void main(String[] args){: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
3.	String[] jajan = {: Mendefinisikan array jajan dengan tipe data String dan memberikan nilai awal berupa daftar makanan ringan atau jajanan.
4.	"es teh",: Menambahkan nilai "es teh" ke dalam array jajan.
5.	"cimol",: Menambahkan nilai "cimol" ke dalam array jajan.
6.	"cilok",: Menambahkan nilai "cilok" ke dalam array jajan.
7.	"batagor",: Menambahkan nilai "batagor" ke dalam array jajan.
8.	"siomai": Menambahkan nilai "siomai" ke dalam array jajan.
9.	};: Menutup array jajan.
10.	for (int i=0; i< jajan.length; i++) {: Memulai perulangan dari 0 hingga panjang array jajan.
11.	System.out.println(jajan[i]);: Menampilkan nilai array jajan pada indeks ke-i.
12.	}: Menutup blok perulangan for.


* Upload tiap code di github dengan menjelaskan setiap code yang sudah dibuat
* Buatlah penjelasan di bagian README.md pada github, dengan contoh sebagai berikut : https://github.com/randiijulian/Machine-Learning-Terapan-Dicoding/blob/3e6ab0735e480fdb6477648ac524d40977ea8a37/Recommender%20System/README.md 

