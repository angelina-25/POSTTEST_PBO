package PIZZA;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Pizza> daftarPizza = new ArrayList<>();
    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println("\n=== SISTEM PEMESANAN PIZZA ONLINE ===");
            System.out.println("1. Tambah Menu Pizza");
            System.out.println("2. Lihat Menu Pizza");
            System.out.println("3. Update Menu Pizza");
            System.out.println("4. Hapus Menu Pizza");
            System.out.println("5. Tambah Pesanan");
            System.out.println("6. Lihat Pesanan");
            System.out.println("7. Exit");

            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPizza();
                    break;

                case 2:
                    lihatPizza();
                    break;

                case 3:
                    updatePizza();
                    break;

                case 4:
                    hapusPizza();
                    break;

                case 5:
                    tambahPesanan();
                    break;

                case 6:
                    lihatPesanan();
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 7);
    }

    static void tambahPizza() {

        System.out.print("Nama Pizza: ");
        String nama = input.nextLine();

        System.out.print("Ukuran Pizza: ");
        String ukuran = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        daftarPizza.add(new Pizza(nama, ukuran, harga));
    }

    static void lihatPizza() {

        for (int i = 0; i < daftarPizza.size(); i++) {
            Pizza p = daftarPizza.get(i);
            System.out.println(i + ". " + p.namaPizza + " - " + p.ukuran + " - Rp" + p.harga);
        }
    }

    static void updatePizza() {

        lihatPizza();

        System.out.print("Index pizza yang diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Nama Pizza baru: ");
        String nama = input.nextLine();

        System.out.print("Ukuran baru: ");
        String ukuran = input.nextLine();

        System.out.print("Harga baru: ");
        int harga = input.nextInt();
        input.nextLine();

        daftarPizza.set(index, new Pizza(nama, ukuran, harga));
    }

    static void hapusPizza() {

        lihatPizza();

        System.out.print("Index pizza yang dihapus: ");
        int index = input.nextInt();

        daftarPizza.remove(index);
    }

    static void tambahPesanan() {

        System.out.print("Nama Customer: ");
        String nama = input.nextLine();

        System.out.print("Nama Pizza yang dipesan: ");
        String pizza = input.nextLine();

        System.out.print("Jumlah Pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        daftarPesanan.add(new Pesanan(nama, pizza, jumlah));
    }

    static void lihatPesanan() {

        for (int i = 0; i < daftarPesanan.size(); i++) {
            Pesanan p = daftarPesanan.get(i);
            System.out.println(i + ". " + p.namaCustomer + " memesan " + p.namaPizza + " sebanyak " + p.jumlah);
        }
    }
}