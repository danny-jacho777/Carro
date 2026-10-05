package negocio;

// Se crea la clase
public class Carro {

    // Se pone en privado los atributos
    private int potencia;
    private double velocidad;

    /*
     ------------------------------------------ SET -------------------------------------------------------
     --> Los métodos set sirven para meter o actualizar datos dentro de un objeto.

     --> Por estandar en Java, estos métodos siempre empiezan con la palabra "set"
         seguido por el nombre del atributo con la primera letra en mayúscula ('setPotencia', 'setVelocidad').

     --> Siempre es void porque no necesita retornar nada.

     --> Siempre necesita un parámetro.

     --> El parámetro generalmente es del mismo tipo de atributo.
     */

    public void setPotencia(int potencia) {

        this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){

        this.velocidad = velocidad;
    }
    //------------------------------------------------------------------------------------------------------


    /*
    --------------------------------------------- GET ------------------------------------------------------
     --> Sirve para leer o consultar la información guardada en un atributo privado.

     --> Por estandar ('getPotencia', 'getVelocidad', etc).

     --> Como su objetivo es dar información, SI retorna algo.

     --> El valor que retorna generalmente es del mismo tipo de atributo.
     */

    public int getPotencia() {
        return potencia;
    }

    public double getVelocidad() {

        return velocidad;
    }
    //------------------------------------------------------------------------------------------------------


    public void acelerar(){

        velocidad += potencia;
    }

    void frenar(){

        velocidad /= 2;
    }
}
