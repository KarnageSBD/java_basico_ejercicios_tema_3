package com.karnage;
import java.lang.String;



public class Main {
    public static void main(String[] args) {


        String[] nombres = {"Jose", "Elena", "Juan", "Laura", "Ainoa", "David"};

       StringBuilder  cadena = new StringBuilder();

      for (String nombre : nombres) {

          cadena.append(nombre);
          cadena.append(" ");
      }
      cadena.delete(cadena.length()-1, cadena.length());
      
        System.out.println(cadena);


    }


}