package PIZZA;

public class Pesanan {

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

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setNamaPizza(String namaPizza) {
        this.namaPizza = namaPizza;
    }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) {
            this.jumlah = jumlah;
        } else {
            System.out.println("Jumlah harus lebih dari 0!");
        }
    }
}