import java.util.Scanner;

class HitungUpah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jam kerja dari user
        System.out.print("Jam kerja : ");
        int jamKerja = input.nextInt();

        // Deklarasi variabel
        int upah = 0;     // upah normal
        int lembur = 0;   // upah lembur
        int denda = 0;    // denda jika jam kerja < 50
        int total = 0;    // total gaji

        // Perhitungan berdasarkan aturan
        if (jamKerja > 60) {
            // Jika jam kerja lebih dari 60 jam
            upah = 60 * 5000; // upah maksimal normal
            lembur = (jamKerja - 60) * 6000; // kelebihan dihitung lembur
        } else {
            // Jika jam kerja <= 60 jam
            upah = jamKerja * 5000;
        }

        if (jamKerja < 50) {
            // Jika kurang dari 50 jam → kena denda
            denda = (50 - jamKerja) * 1000;
        }

        // Hitung total
        total = upah + lembur - denda;

        // Tampilkan hasil
        System.out.println("Upah   = Rp. " + upah);
        System.out.println("Lembur = Rp. " + lembur);
        System.out.println("Denda  = Rp. " + denda);
        System.out.println("-----------------------");
        System.out.println("Total  = Rp. " + total);

        input.close();
    }
}