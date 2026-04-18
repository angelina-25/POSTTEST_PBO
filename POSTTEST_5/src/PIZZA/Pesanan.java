package PIZZA;

public class Pesanan implements Transaksi {

    private String namaCustomer;
    private String namaPizza;
    private int jumlah;

    Pesanan(String namaCustomer, String namaPizza, int jumlah) {
        this.namaCustomer = namaCustomer;
        this.namaPizza = namaPizza;
        this.jumlah = jumlah;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNamaPizza() {
        return namaPizza;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) {
            this.jumlah = jumlah;
        }
    }

    // IMPLEMENTASI INTERFACE
    @Override
    public void prosesPesanan() {
        System.out.println("Pesanan sedang diproses...");
    }

    @Override
    public void tampilStruk() {
        System.out.println("=== STRUK ===");
        System.out.println("Customer: " + namaCustomer);
        System.out.println("Pizza: " + namaPizza);
        System.out.println("Jumlah: " + jumlah);
    }
}