import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        double rata2;

        for (int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();
        }
            for (int i=0; i<nilaiMhs.length; i++){
                if (nilaiMhs[i] > 70) {
                    System.out.println("Nilai akhir mahasiswa ke-" +(i+1)+ " lulus!");
                }else{
                    System.out.println("Nilai akhir mahasiswa ke-" +(i+1)+ " tidak lulus!");
                }
            }
                for (int i=0; i<nilaiMhs.length; i++){
                    total += nilaiMhs[i];
                }
                rata2 = total/nilaiMhs.length;
                System.out.println("Rata-rata nilai lulus = " +rata2);
                System.out.println("Rata-rata nilai tidak lulus = " +rata2);
    }
}
