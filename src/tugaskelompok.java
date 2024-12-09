import java.util.Scanner;
public class tugaskelompok {
    static String[] pelanggan = new String[10];
    static int[] nomor = new int[10];
    static String[] banyakmenu = {"", "Kopi Hitam", "Latte", "Teh Tarik", "Mie Goreng"};
    static int[] hargamenu = {0, 15000, 22000, 12000, 18000};
    static String[][] data1 = new String[10][5];
    static int[][] jmlh = new int[10][5];
    static int[][] harga = new int[10][5];
    static int k = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int menu = tampilkanMenu(sc);
            if (menu == 1) {
                tambahkanPesanan(sc);
            } else if (menu == 2) {
                tampilkanPesanan();
            } else if (menu == 3) {
                System.out.println("Terima kasih! Sampai jumpa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        sc.close();
    }

    public static int tampilkanMenu(Scanner sc) {
        System.out.println("===== Menu Utama =====");
        System.out.println("1. Tambahkan Pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        return sc.nextInt();
    }

    public static void tambahkanPesanan(Scanner sc) {
        sc.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan nama pelanggan: ");
        pelanggan[k] = sc.nextLine();
        System.out.print("Masukkan nomor meja: ");
        nomor[k] = sc.nextInt();

        System.out.println("\n===== MENU KAFE =====");
        for (int i = 1; i < banyakmenu.length; i++) {
            System.out.println(i + ". " + banyakmenu[i] + " - Rp " + hargamenu[i]);
        }

        int total = 0;
        int j = 0;
        while (true) {
            System.out.print("Pilih menu (masukkan nomor menu atau 0 untuk selesai): ");
            int menu = sc.nextInt();
            if (menu == 0) break;

            System.out.print("Masukkan jumlah item untuk " + banyakmenu[menu] + ": ");
            int banyakbeli = sc.nextInt();

            total += (hargamenu[menu] * banyakbeli);
            data1[k][j] = banyakmenu[menu];
            jmlh[k][j] = banyakbeli;
            harga[k][j] = hargamenu[menu] * banyakbeli;
            j++;
        }

        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("Total harga pesanan: Rp " + total);
        k++;
    }

    public static void tampilkanPesanan() {
        System.out.println("====== DAFTAR PESANAN ======");
        for (int i = 0; i < k; i++) {
            System.out.println("Nama pelanggan: " + pelanggan[i]);
            System.out.println("Nomor meja: " + nomor[i]);
            System.out.println("Detail Pesanan:");
            int total = 0;
            for (int j = 0; j < data1[i].length; j++) {
                if (data1[i][j] == null) break;
                System.out.println(data1[i][j] + " x " + jmlh[i][j] + " = " + harga[i][j]);
                total += harga[i][j];
            }
            System.out.println("Total harga pesanan: Rp " + total);
            System.out.println();
        }
    }
}
