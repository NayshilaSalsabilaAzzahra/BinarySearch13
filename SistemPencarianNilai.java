import java.util.Scanner;

public class SistemPencarianNilai {
    public static void main(String[] args) {
        // a. Menyimpan array nilai terurut
        int[] nilaiMahasiswa = {65, 70, 75, 80, 85, 90, 95, 100};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();
        
        int low = 0;
        int high = nilaiMahasiswa.length - 1;
        int langkah = 0;
        int indeksDitemukan = -1;
        boolean ditemukan = false;

        // b. Mencari nilai menggunakan Binary Search
        while (low <= high) {
            langkah++; // Menghitung jumlah langkah
            int mid = (low + high) / 2;

            if (nilaiMahasiswa[mid] == cari) {
                indeksDitemukan = mid;
                ditemukan = true;
                break;
            } else if (cari < nilaiMahasiswa[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // c. Menampilkan hasil pengujian
        System.out.println("--- Hasil Pengamatan ---");
        if (ditemukan) {
            System.out.println("Status: Ditemukan");
            System.out.println("Indeks ditemukan: " + indeksDitemukan);
        } else {
            System.out.println("Status: Tidak ditemukan");
            System.out.println("Indeks ditemukan: -1");
        }
        System.out.println("Jumlah langkah pencarian: " + langkah);
    }
}