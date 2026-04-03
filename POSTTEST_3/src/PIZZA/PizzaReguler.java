package PIZZA;

public class PizzaReguler extends Pizza {

    PizzaReguler(String namaPizza, String ukuran, int harga) {
        super(namaPizza, ukuran, harga);
    }

    @Override
    public String getInfo() {
        return "[Reguler] " + getNamaPizza() + " - " + getUkuran() + " - Rp" + getHarga();
    }
}