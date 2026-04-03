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

    //  MENU PIZZA

    static void tambahPizza() {

        System.out.println("Jenis Pizza:");
        System.out.println("1. Reguler");
        System.out.println("2. Premium");
        System.out.print("Pilih: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Nama Pizza: ");
        String nama = input.nextLine();

        System.out.print("Ukuran Pizza: ");
        String ukuran = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        if (jenis == 1) {
            daftarPizza.add(new PizzaReguler(nama, ukuran, harga));
        } else if (jenis == 2) {
            daftarPizza.add(new PizzaPremium(nama, ukuran, harga));
        } else {
            System.out.println("Jenis tidak valid!");
        }
    }

    static void lihatPizza() {

        if (daftarPizza.isEmpty()) {
            System.out.println("Menu pizza belum tersedia.");
            return;
        }

        for (int i = 0; i < daftarPizza.size(); i++) {
            Pizza p = daftarPizza.get(i);
            System.out.println(i + ". " + p.getInfo());
        }
    }

    static void updatePizza() {

        lihatPizza();

        System.out.print("Index pizza yang diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= daftarPizza.size()) {
            System.out.println("Index tidak valid!");
            return;
        }

        System.out.print("Nama Pizza baru: ");
        String nama = input.nextLine();

        System.out.print("Ukuran baru: ");
        String ukuran = input.nextLine();

        System.out.print("Harga baru: ");
        int harga = input.nextInt();
        input.nextLine();

        Pizza p = daftarPizza.get(index);
        p.setNamaPizza(nama);
        p.setUkuran(ukuran);
        p.setHarga(harga);
    }

    static void hapusPizza() {

        lihatPizza();

        System.out.print("Index pizza yang dihapus: ");
        int index = input.nextInt();

        if (index < 0 || index >= daftarPizza.size()) {
            System.out.println("Index tidak valid!");
            return;
        }

        daftarPizza.remove(index);
    }

    //  PESANAN

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

        if (daftarPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        for (int i = 0; i < daftarPesanan.size(); i++) {
            Pesanan p = daftarPesanan.get(i);
            System.out.println(i + ". " + p.getNamaCustomer() + " memesan "
                    + p.getNamaPizza() + " sebanyak " + p.getJumlah());
        }
    }
}