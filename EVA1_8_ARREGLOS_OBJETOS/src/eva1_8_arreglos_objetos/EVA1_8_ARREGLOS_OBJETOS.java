/*
 * "Evaluación 1 Práctica 8 "Arreglos Objetos"
 *  25/08/2022"
 */
package eva1_8_arreglos_objetos;

/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        Prueba[] arregloPrueba = new Prueba[20];
        //Crear los objetos
        for (int i = 0; i < arregloPrueba.length; i++) {
            //Clase identificador = new Clase();
            arregloPrueba[i] = new Prueba();
        }
        //Leer X
        for (Prueba prueba : arregloPrueba) {
            System.out.println(prueba.x);
        }
    }
}

class Prueba{
    int x = 100;
}
