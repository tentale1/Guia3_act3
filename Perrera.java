import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa para simular BD de una guarderia
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190908
 */

public class Perrera{
    private String name, loc, bread, nown, day, tel;
    private int id;
    
    public Perrera(String name, String loc, String bread, int id, String nown, String day, String tel){
        this.name = name;
        this.loc = loc;
        this.bread = bread;
        this.id = id;
        this.nown = nown;
        this.day = day;
        this.tel = tel;
    }

    public String getname(){
        return this.name;
    }

    public String getloc(){
        return this.loc;
    }
        
    public String getbread(){
        return this.bread;     
    }

    public int getid(){
        return this.id;     
    }

    public String getnameown(){
        return this.nown;      
    }

    public String getday(){
        return this.day;       
    }

    public String getel(){
        return this.tel;       
    }

    public static void main (String[] args){
        ArrayList<Perrera> newdog = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int select, id, qtdogs;
        String name, loc, bread, nown, day, tel;
        Perrera perrera;
        
        do{
            System.out.println("SELECCIONAR UNA DE LAS SIGUIENTES OPCIONES");
            System.out.println("Presione la tecla 1 para registrar un nuevo perro a la base de datos del colegio.");
            System.out.println("Presione la tecla 2 para ver información de perros por localidad.");
            System.out.println("Presione la tecla 3 para ver la cantidad de perros registrados en el colegio.");
            System.out.println("Presione la tecla 0 para cerrar el programa.");
            select = teclado.nextInt();

            switch (select){
                case 1:
                teclado.nextLine();
                System.out.println("¿Como se llama su perro?");
                name = teclado.nextLine();
                System.out.println("Favor ingresar su localidad (Teusaquillo, Suba, Usaquén y Chapinero).");
                loc = teclado.nextLine();
                System.out.println("¿De que raza es su perro?");
                bread = teclado.nextLine();
                System.out.println("¿En que días le gustaría que cuidaramos de su perro?");
                day = teclado.nextLine();
                System.out.println("por favor ingresar el nombre del propietario (diga los días separados por coma).");
                nown = teclado.nextLine();
                System.out.println("¿Cual es su número de contacto?");
                tel = teclado.nextLine();
                System.out.println("Por favor ingresar la cedula del dueño.");
                id = teclado.nextInt();

                perrera = new Perrera(name, loc, bread, id, nown, day, tel);
                newdog.add(perrera);
                break;

                case 2:
                seedogsloc(newdog);
                break;

                case 3:
                qtdogs = newdog.size();
                System.out.println("En la guardería tenemos: "+qtdogs+ " perros registrados");
            }
        } while (select != 0);
    }

    public static void seedogsloc (ArrayList<Perrera> bd){
        String loc;
        Perrera perrera;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿De cual localidad desea ver los perros registrados? (Teusaquillo, Suba, Usaquén y Chapinero).");
        loc = teclado.nextLine();
        
        for(Perrera nd : bd){
            if (nd.getloc().equals(loc)){
                nd.seeloc();                
            }
        }
    }

    public void seeloc(){
        System.out.println("Nombre del perro: " +name);
        System.out.println("Raza: " +bread);
        System.out.println("Asiste el/los día(s): " +day);
        System.out.println("# de Cedula del dueño: "+id);
        System.out.println("Nombre del propietario: "+nown);
        System.out.println("Número de contacto del dueño: "+tel);
        System.out.println("******************************************************");
    }
}