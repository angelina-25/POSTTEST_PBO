package PIZZA;

public class PizzaPremium extends Pizza {

    PizzaPremium(String namaPizza, String ukuran, int harga) {
        super(namaPizza, ukuran, harga);
    }

    @Override
    public int hitungHarga() {
        return getHarga() + 20000;
    }

    @Override
    public String getInfo() {
        return "[Premium] " + getNamaPizza() + " - " + getUkuran() + " - Rp" + hitungHarga();
    }
}