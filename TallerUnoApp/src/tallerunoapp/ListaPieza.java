
package tallerunoapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaPieza {
    
    private List <Piezas> listP;
    
    public ListaPieza(){
        listP = new ArrayList<Piezas>();
    }
    
    public void adicionarPieza(Piezas obj){
        listP.add(obj);
    }
    
    public void ingresoPieza(){
        int n_pieza;
        String name;
        String marca;
        int price;
        int time;
        int n;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas piezas deseas ingresar: ");
        n = sc.nextInt();
        
        try{
            ListaPieza objListaP = new ListaPieza();
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            archivo = new File("piezas.txt");
            for(int i = 0; i<n; i++){
                
                System.out.println("Pieza "+(i+1));
                
                System.out.println("Ingrese el numero de pieza: ");
                n_pieza = Integer.parseInt(br.readLine());
                System.out.println("Ingrese el nombre de la pieza: ");
                name = br.readLine();
                System.out.println("Ingrese la marca de la pieza: ");
                marca = br.readLine();
                System.out.println("Ingrese el precio de la pieza: ");
                price = Integer.parseInt(br.readLine());
                System.out.println("Ingrese el tiempo que requiere la instalacion de la pieza: ");
                time = Integer.parseInt(br.readLine());
                               
                Piezas obj = new Piezas(n_pieza,name,marca,price,time);
                
                objListaP.adicionarPieza(obj);
                
                
            }
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(objListaP);
            linea.close();
            escribir.close();
            //objListaP.impresion1();
        }
        catch(Exception e){
            System.out.println("Captura error");
        }
        
    }
    
    public void impresion1(){
        Iterator it = listP.iterator();
        while(it.hasNext()){
            Piezas aux = (Piezas) it.next();
            System.out.println(aux.toString());
        }
    }
}
