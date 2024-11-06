package com.example.bigoalgorithmsdatastructures;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        //Complejidad temporal O(N)
        // Invertir un array

        int[] array = {2, 4, 6, 8, 10};

        System.out.print("El array original es: ");
        for (int num : array) {
            System.out.print(num + ",");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int reversePosition = array.length - 1 - i;
            array[i] = array[reversePosition];
            array[reversePosition] = temp;
        }
        System.out.print("El nuevo array es: ");
        for (int num : array) {
            System.out.print(num + ",");

        }

        printUnorderedPairs(array);
        System.out.println("El resultado de la multiplicación es: " + product(4, 2));


    }

    // Método para imprimir parejas de manera desordenada
    // Este método tiene una complejidad temporal de 𝑂 (𝑛 2)porque hay dos bucles anidados que recorren el array, generando todas las combinaciones posibles de parejas sin repetición.
    public void printUnorderedPairs(int[] array) {
        System.out.println("Parejas desordenadas:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

    int product(int a, int b) {

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}
