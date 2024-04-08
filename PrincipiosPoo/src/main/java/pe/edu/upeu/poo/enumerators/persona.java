
package pe.edu.upeu.poo.enumerators;
enum genero {Femenino,Masculino }
        enum estado_civil{casado,divorciado,soltero}
public class persona {
    public static void main(String[] args) {
        System.out.println("genero"+genero.Masculino);
        for (estado_civil ec:estado_civil.values()) {
            System.out.println(ec);
        }
    }
    
}
