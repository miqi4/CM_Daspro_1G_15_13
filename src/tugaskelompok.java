import java.util.Scanner;
public class tugaskelompok {

    public static void main(String[] args) {
        String pelanggan="";
        int banyakbeli=0,total=0,nomor=0;
        int menu=0;
        String[] banyakmenu ={"","kopi hitam","Latte","Teh tarik","Mie Goreng"}; 
        int[] hargamenu ={0,15000,22000,12000,18000};
        String[] data1=new String[5];
        int[] jmlh=new int[5];
        int[] harga=new int[5];
        do {
        Scanner sc = new Scanner (System.in);
        System.out.println("===== Menu utama ======");
        System.out.println("1. Tambahkan pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu : ");
        int minu = sc.nextInt();
        sc.nextLine();
        if (minu == 1) {
        System.out.print("Massukan nama pelanggan : ");
        pelanggan = sc.nextLine();
        System.out.print("Massukan nomor meja : ");
        nomor = sc.nextInt();
        System.out.println();
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");
        int j=0;
        do {
            System.out.print("Pilih menu (masukkan nomer menu atau 0 untuk selesai ) : ");
            menu = sc.nextInt();
            if (menu!=0) {
            System.out.print("masukkan jumlah item untuk "+banyakmenu[menu]+" : ");
            banyakbeli = sc.nextInt();
            total+=(hargamenu[menu]*banyakbeli);}
            harga[j]=(hargamenu[menu]*banyakbeli);
            data1[j]=banyakmenu[menu];
            jmlh[j]=banyakbeli;
            j++;
            } while (menu!=0);
        System.out.println("pesanan berhasil di tambahkan");
        System.out.println("total haraga pesanan : Rp "+total);
        }
        if (minu == 2) {
            System.out.println("====== DAFTAR PESANAN ======");
            System.out.println("nama pelanggan = "+pelanggan);
            System.out.println("nomor meja = "+nomor);
            System.out.println("Detail Pesanan : ");
            for (int i = 0; i < jmlh.length; i++) {
                if (data1[i].equalsIgnoreCase("")) {
                break;
                }else System.out.println(data1[i]+" x "+jmlh[i]+" = "+harga[i]);
            }
        }
        if (minu == 3) {break;}
        } while (true);
    }
}
