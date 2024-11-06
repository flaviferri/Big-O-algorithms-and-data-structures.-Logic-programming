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

        int[] array ={ 2,4,6,8,10};

        for ( int num :array){
            System.out.println("El array original es "+ num);
        }
        for (int i=0; i<array.length/2; i++){
            int temp = array[i];
            int reversePosition = array.length-1-i;
            array[i]= array[reversePosition];
            array[reversePosition]= temp;
        }

        for(int num : array){
            System.out.println("El nuevo array es "+ num);
        }


        }

    // Imprimir parejas de manera desordenada
    public void printUnorderedPairs(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
