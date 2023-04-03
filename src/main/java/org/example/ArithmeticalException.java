package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticalException {
    public static void main(String[] args) {

        float resultado = 0;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            float num1 = entrada.nextFloat();
            System.out.println("Ingrese otro numero: ");
            float num2 = entrada.nextFloat();
            resultado = num1 / num2;
            System.out.println("Resultado : " + resultado);
        } catch (InputMismatchException e2) {
            System.out.println("Datos ingresados incorrectos");
        } catch (Exception e) {
            System.out.println("No se puede dividir byZero");
        } finally {
            System.out.println("Ejecutado");

        }
    }
}
