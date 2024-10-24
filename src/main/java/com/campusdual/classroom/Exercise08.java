package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {

        int Y= 10;//Defino el valor de Y

        whileLoop(Y);//Llamo al metodo

    }
    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int Y) {
        int X=0; //Empiezo el loop en 0
        while (X < Y){
            System.out.println(X + " < " + Y + ". El proximo ciclo valdra: " + (X+1));
            X++;//Sumo 1 al valor de X
        }
    }
}