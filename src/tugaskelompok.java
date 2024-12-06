import java.util.Scanner;
public class tugaskelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("===== Menu utama ======");
        System.out.println("1. Tambahkan pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu : ");
        int minu = sc.nextInt();
        if (minu == 1) {
            System.out.print("Massukan nama pelanggan : ");
            String pelanggan = sc.next();
            System.out.print("Massukan nomor meja : ");
            int nomor = sc.nextInt();
        }


        
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");
        String[] banyakmenu ={"kopi hitam","Latte","Teh tarik","Mie Goreng"}; 
        int[] hargamenu ={15000,22000,12000,18000};
        int menu=0,total=0,banyakbeli=0;
        do {
            System.out.print("Pilih menu (masukkan nomer menu atau 0 untuk selesai ) : ");
            menu = sc.nextInt();
            if (menu!=0) {
                System.out.print("masukkan jumlah item untuk "+banyakmenu[menu-1]+" : ");
            banyakbeli = sc.nextInt();
            total+=(hargamenu[menu-1]*banyakbeli);
            }
        } while (menu!=0);
        System.out.println("pesanan berhasil di tambahkan");
        System.out.println("total haraga pesanan : Rp "+total);
    }
}
