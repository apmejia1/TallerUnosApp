
package tallerunoapp;

public class Piezas {
    private int n_pieza;
    private String name;
    private String marca;
    private int price;
    private int time;
    
    //CONSTRUCTOR

    public Piezas(int n_pieza, String name, String marca, int price, int time) {
        this.n_pieza = n_pieza;
        this.name = name;
        this.marca = marca;
        this.price = price;
        this.time = time;
    }

    public int getN_pieza() {
        return n_pieza;
    }

    public void setN_pieza(int n_pieza) {
        this.n_pieza = n_pieza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Piezas{" + "n_pieza=" + n_pieza + ", name=" + name + ", marca=" + marca + ", price=" + price + ", time=" + time + '}';
    }
    
}
