
package tallerunoapp;

public class Obra {
    
    private int n_obra;
    private String name_obra;
    private int precio_obra;
    private int time_obra;
    
    //CONSTRUCTOR

    public Obra(int n_obra, String name_obra, int precio_obra, int time_obra) {
        this.n_obra = n_obra;
        this.name_obra = name_obra;
        this.precio_obra = precio_obra;
        this.time_obra = time_obra;
    }
    
    //GETTER AND SETTER

    public int getN_obra() {
        return n_obra;
    }

    public void setN_obra(int n_obra) {
        this.n_obra = n_obra;
    }

    public String getName_obra() {
        return name_obra;
    }

    public void setName_obra(String name_obra) {
        this.name_obra = name_obra;
    }

    public double getPrecio_obra() {
        return precio_obra;
    }

    public void setPrecio_obra(int precio_obra) {
        this.precio_obra = precio_obra;
    }

    public int getTime_obra() {
        return time_obra;
    }

    public void setTime_obra(int time_obra) {
        this.time_obra = time_obra;
    }
    
    //toString

    @Override
    public String toString() {
        return "Obra{" + "n_obra=" + n_obra + ", name_obra=" + name_obra + ", precio_obra=" + precio_obra + ", time_obra=" + time_obra + '}';
    }
    
    
}
