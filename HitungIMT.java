import java.util.Scanner;

class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan
        System.out.print("Berat badan (kg) : ");
        double berat = input.nextDouble();

        // Input tinggi badan (meter)
        System.out.print("Tinggi badan (m) : ");
        double tinggi = input.nextDouble();

        // Hitung IMT = berat / (tinggi * tinggi)
        double imt = berat / (tinggi * tinggi);

        // Tentukan kategori berdasarkan nilai IMT
        String kategori;
        if (imt <= 18.5) {
            kategori = "Kurus";
        } else if (imt > 18.5 && imt <= 25) {
            kategori = "Normal";
        } else if (imt > 25 && imt <= 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Kegemukan";
        }

        // Tampilkan hasil
        System.out.printf("IMT = %.2f Termasuk %s\n", imt, kategori);

        input.close();
    }
}