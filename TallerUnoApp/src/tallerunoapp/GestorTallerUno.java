
package tallerunoapp;

public class GestorTallerUno {

    public static void main(String[] args) {
        
        ListaPieza objListaP = new ListaPieza();
        ListaObra objListaO = new ListaObra();
        System.out.println("-----BIENVENIDO A NUESTRO SISTEMA-----");
        System.out.println("Debes ingresar las piezas ");
        objListaP.ingresoPieza();
        objListaP.impresion1();
        System.out.println("Debes ingresar la obra ");
        objListaO.ingresoObra();
    }
    
}
