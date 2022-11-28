
package tallerunoapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaObra {
    private List <Obra> listO;
    
    public ListaObra(){
        listO = new ArrayList<Obra>();
    }
    
    public void adicionarObra(Obra obj){
        listO.add(obj);
    }
    
    public void ingresoObra(){
        int n_obra;
        String name_obra;
        int precio_obra;
        int time_obra;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner sc = new Scanner(System.in);
        
        try{
            ListaObra objListaO = new ListaObra();
            
            System.out.println("Numero de la Obra: ");
            n_obra = Integer.parseInt(br.readLine());
            System.out.println("Nombre de la Obra: ");
            name_obra = br.readLine();
            System.out.println("Precio de la Obra: ");
            precio_obra = Integer.parseInt(br.readLine());
            System.out.println("Tiempo de la Obra: ");
            time_obra = Integer.parseInt(br.readLine());
            
            Obra obj = new Obra(n_obra,name_obra,precio_obra,time_obra);
            objListaO.adicionarObra(obj);
            
        }
        catch(Exception e){
            System.out.println("Captura Error");
        }
    }
}
