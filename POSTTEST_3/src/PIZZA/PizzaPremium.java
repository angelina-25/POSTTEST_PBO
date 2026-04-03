package PIZZA;

public class PizzaPremium extends Pizza {

    PizzaPremium(String namaPizza, String ukuran, int harga) {
        super(namaPizza, ukuran, harga);
    }

    @Override
    public String getInfo() {
        int hargaPremium = getHarga() + 20000;
        return "[Premium] " + getNamaPizza() + " - " + getUkuran() + " - Rp" + hargaPremium;
    }
}