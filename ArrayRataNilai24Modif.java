import java.util.Scanner;

public class ArrayRataNilai24Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        
        // Deklarasi variabel
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;
        
        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            
            // Kategorikan nilai lulus atau tidak lulus
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // Menghitung rata-rata untuk yang lulus dan tidak lulus
        double rata2Lulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rata2TidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        input.close();
    }
}
