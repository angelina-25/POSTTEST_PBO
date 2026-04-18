package PIZZA;

public abstract class Pizza {

    private String namaPizza;
    private String ukuran;
    private int harga;

    Pizza(String namaPizza, String ukuran, int harga) {
        this.namaPizza = namaPizza;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getNamaPizza() {
        return namaPizza;
    }

    public String getUkuran() {
        return ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setNamaPizza(String namaPizza) {
        this.namaPizza = namaPizza;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh minus!");
        }
    }

    // ABSTRACT METHOD
    public abstract int hitungHarga();

    public String getInfo() {
        return namaPizza + " - " + ukuran + " - Rp" + hitungHarga();
    }

    public String getInfo(boolean denganDiskon) {
        if (denganDiskon) {
            int diskon = hitungHarga() - (hitungHarga() * 10 / 100);
            return namaPizza + " - " + ukuran + " - Rp" + diskon + " (Diskon 10%)";
        } else {
            return getInfo();
        }
    }
}