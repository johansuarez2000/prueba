/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> gerentes = new ArrayList<>();
        

        // Adding new elements to the ArrayList
        gerentes.add("jorge");
        gerentes.add("Juan");
       
        for (int x = 0; x < 2; x++) {
        System.out.println("el gerente del equipo " +(x+1) +" es "+ gerentes.get(x));    
        }
        
        

        // Adding an element at a particular index in an ArrayList
    

    }
}
