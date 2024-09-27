package programas;

/*

*/
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //Declarar variables
        int edad, cantPer, cantPerSM, cantPerSF;
        String sexo = "", rpta = "";
        double promedioEdad, sumaEdades;
        boolean estado=true;
        
        Scanner lectura = new Scanner(System.in);
        
        //Inizializar variables
        cantPer = 0;
        cantPerSM = 0;
        cantPerSF = 0;
        sumaEdades = 0;
        
        //Proceso
        do {
            
            System.out.print("Ingrese su Edad: ");
            edad = lectura.nextInt();
            System.out.print("Ingrese su Sexo: ");
            sexo = lectura.next();
            cantPer++;
            sumaEdades+=edad;
            if (sexo.equals("m")) {
                cantPerSM++;
            }else{
                cantPerSF++;
            }
           
            do {                
                System.out.print("Desea continuar si/no: ");
                rpta = lectura.next();
                if (rpta.equals("si") || rpta.equals("no")) {
                    estado = false;
                }else{
                    estado = true;
                    System.out.print("Solo se debe ingresar si o no: ");
                }
            } while (estado);            
        } while (rpta.equals("si"));   
        
        promedioEdad = sumaEdades / cantPer;
        
        //Salida de datos
        System.out.println("Cantidad de personas: " + cantPer);
        System.out.println("Cantidad de personas de sexo masculino: " + cantPerSM);
        System.out.println("Cantidad de personas de sexo femenino: " + cantPerSF);
        System.out.println("Promedio de edad de las personas: " + promedioEdad);
    }
}
