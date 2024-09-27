
package programas;

/*
Crear un programa en Java que permita ingresar el 
nombre de los alumnos y sus tres notas de cada uno, 
preguntar al usuario si desea continuar registrando 
datos. Visualizar el nombre del alumno con 
el mayor promedio obtenido.

Por ejemplo:
nro alumno nota1 nota2 nota3 promedio  opc
1   Juan   14    16    18    16.0      si
2   Pedro  15    17    19    17.0      si
3   Rosa   12    10    14    12.0      no

Resultados:
alumno=Pedro
promedio=17.0
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //Declarar variables
        String nombre,mejoralum="",opc="";
        int nota,n1,n2,n3,i=0;
        double prom,promax=0;
        Scanner lectura=new Scanner(System.in);
        //Proceso de datos
        do{
            System.out.print("Ingrese el nombre del "+(i+1)+"° alumno: ");
            nombre=lectura.next();
            System.out.print("Ingrese la 1ra nota: ");
            n1=lectura.nextInt();
            System.out.print("Ingrese la 2da nota: ");
            n2=lectura.nextInt();
            System.out.print("Ingrese la 3ra nota: ");
            n3=lectura.nextInt();
            prom=(n1+n2+n3)/3;
            System.out.println("El promedio es "+prom);
            if (prom>promax){
                promax=prom;
                mejoralum=nombre;
            }
            System.out.print("¿Desea continuar? [S o N]: ");
            opc=lectura.next();
            i++;
            n1=0;
            n2=0;
            n3=0;
            prom=0;
        }while(opc.equals("S"));
        //Salida de datos
        System.out.println("-----------------------------------");
        System.out.println(mejoralum+" tiene el mayor promedio");
        System.out.println("Obtuvo: "+promax);
        System.out.println("-----------------------------------");
    }
}
