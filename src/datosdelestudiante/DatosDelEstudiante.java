/*
Implemente un algoritmo que le permita solicitar el Ingreso por teclado el 
nombre de la unversidad, el departamento la carrera, el nombre de la materia, 
nombres completos del estudiante, nivel, numero de cedula, pais, ciudad, canto,
provincia, ID, sexo.
 */
package datosdelestudiante;

/**
 *
 * @author: Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new, reserva espacio de memoria
        System.out.println("Ingrese el nombre de la universidad:");
        String nombreUniversidad=objeto.nextLine();
        
        System.out.println("Ingrese el Departamento:");
        String departemento=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la MATERIA:");
        String nombreMateria=objeto.nextLine();
        
        System.out.println("Nombres del Estudiante:");
        String nombreEstudiante=objeto.nextLine();
        
        System.out.println("Nivel del Estudiante:");
        String nivel=objeto.nextLine();
        
        System.out.println("Numero de Cedula:");
        String numeroCedula=objeto.nextLine();
        
        System.out.println("Ingrese el Pais de Origen:");
        String pais=objeto.nextLine();
        
        System.out.println("Ingrese la ciudad de Origen:");
        String ciudad=objeto.nextLine();
        
        System.out.println("Ingrese canton de Origen:");
        String canton=objeto.nextLine();
        
        System.out.println("Ingrese la Provincia:");
        String provincia=objeto.nextLine();
        
        System.out.println("ID del Estudiante:");
        String idEstudiante=objeto.nextLine();
        
        System.out.println("Ingrese el tipo de SEXO:");
        String sexo=objeto.nextLine();
        
        System.out.println("Bienvenido a la Universida:" +nombreUniversidad);
    }
    
}