import java.util.Scanner;

public class ManajemenNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();
        int[] nilaiMahasiswa = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        int total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            total += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\nNilai Mahasiswa:");
        for (int nilai : nilaiMahasiswa) {
            System.out.println(nilai);
        }
        
        System.out.println("\nNilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);
        
    }
}
