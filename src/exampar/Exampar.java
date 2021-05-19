/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampar;

/**
 *
 * @author Adriana
 */
public class Exampar {
    
    private static String nombre;
    private static String descripcion;
    private static String habilidades;
    private static Integer experiencia;
    private static String nivel;
        public Exampar(String nombre, String descripcion, String habilidades, Integer experiencia, String nivel){
            Exampar.nombre= nombre;
            Exampar.descripcion= descripcion;
            Exampar.habilidades = habilidades;
            Exampar.experiencia = experiencia;
            Exampar.nivel = nivel;
        }
        
        public static int sueldo(){
            int salario = 0;
            if(nivel.equalsIgnoreCase("Jr")){
                salario = 1000 * (1+(experiencia/10));
            }else if (nivel.equalsIgnoreCase("Sr")){
                salario = 1500 * (1+(experiencia/10));
            }else if (nivel.equalsIgnoreCase("Leader")){
                salario = 2000 * (1+(experiencia/10));
            }else if (nivel.equalsIgnoreCase("Boss")){
                salario = 2500 * (1+(experiencia/10));
            }
            return salario;                                     
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exampar examenp= new Exampar ("developper", "Desarrollo de aplicaciones", "Base de Datos", 12, "Leader");
        System.out.println(sueldo());
    }
    
}
