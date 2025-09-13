// Import library Scanner untuk input dari keyboard
import java.util.Scanner;

// Deklarasi class bernama HitungBangun
class HitungBangun {
    // Fungsi utama program
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input pengguna
        Scanner input = new Scanner(System.in);
        int pilihan; // Variabel untuk menyimpan pilihan menu

        // Menampilkan menu ke layar
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("\nPilihan anda: ");
        pilihan = input.nextInt(); // Membaca pilihan user

        // Struktur kontrol switch-case untuk memilih perhitungan
        switch (pilihan) {
            case 1: // Jika user memilih 1 → persegi panjang
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble(); // Input panjang
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble(); // Input lebar

                double luasPP = p * l; // Rumus luas persegi panjang
                double kelilingPP = 2 * (p + l); // Rumus keliling persegi panjang

                // Menampilkan hasil
                System.out.println("\nLuas persegi panjang     : " + luasPP + " cm2");
                System.out.println("Keliling persegi panjang : " + kelilingPP + " cm");
                break;

            case 2: // Jika user memilih 2 → lingkaran
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble(); // Input jari-jari

                double luasLingkaran = Math.PI * r * r; // Rumus luas lingkaran
                double kelilingLingkaran = 2 * Math.PI * r; // Rumus keliling lingkaran

                // Menampilkan hasil
                System.out.println("\nLuas lingkaran     : " + luasLingkaran + " cm2");
                System.out.println("Keliling lingkaran : " + kelilingLingkaran + " cm");
                break;

            case 3: // Jika user memilih 3 → segitiga
                System.out.print("Masukkan sisi a: ");
                double a = input.nextDouble(); // Input sisi a
                System.out.print("Masukkan sisi b: ");
                double b = input.nextDouble(); // Input sisi b
                System.out.print("Masukkan sisi c: ");
                double c = input.nextDouble(); // Input sisi c

                double kelilingSegitiga = a + b + c; // Keliling segitiga = jumlah sisi
                double s = kelilingSegitiga / 2.0;   // Setengah keliling (untuk rumus Heron)
                // Rumus Heron untuk luas segitiga, ditambah Math.max agar tidak error jika hasil negatif karena pembulatan
                double luasSegitiga = Math.sqrt(Math.max(0, s * (s - a) * (s - b) * (s - c))); 

                // Menampilkan hasil
                System.out.println("\nKeliling segitiga : " + kelilingSegitiga + " cm");
                System.out.println("Luas segitiga     : " + luasSegitiga + " cm2");
                break;

            default: // Jika pilihan user tidak valid
                System.out.println("\nData tak ditemukan, program dihentikan ...");
        }

        input.close(); // Menutup Scanner agar tidak terjadi memory leak
    }
}