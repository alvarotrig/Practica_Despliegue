/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadocpractica;

/**
 * Esta clase permite realizar operaciones matemáticas como suma, resta, 
 * multiplicación y división con números de tipo double.
 * 
 * Se encarga de manejar la excepción en caso de una división entre cero.
 * 
 * @author adrian
 * @version 1.0
 * @see java.lang.Math
 * @since 2025
 */

public class Calculadora {
    
    /**
     * Constructor por defecto de la clase Calculadora.
     * 
     * Inicializa una nueva instancia de Calculadora sin parámetros.
     */
    public Calculadora() {
        // Constructor vacío
    }
        
    /**
     * Suma dos números y devuelve el resultado.
     * 
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Resultado de la suma de a y b.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta el segundo número del primero y devuelve el resultado.
     * 
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return Resultado de la resta de a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números y devuelve el resultado.
     * 
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return Resultado de la multiplicación de a y b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide el primer número entre el segundo y devuelve el resultado.
     * 
     * @param a Dividendo.
     * @param b Divisor (debe ser distinto de cero).
     * @return Resultado de la división de a entre b.
     * @throws ArithmeticException Si b es igual a cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Calcula la potencia de un número.
     * 
     * Este método utiliza internamente el método {@link} #multiplicar(double, double)}.
     * 
     * @param base Número base.
     * @param exponente Exponente al que se elevará la base.
     * @return Resultado de elevar la base al exponente.
     */
    public double calcularPotencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = multiplicar(resultado, base);
        }
        return resultado;
    }
    /**
     * Calcula el promedio de un conjunto de números.
     * 
     * @param numeros Arreglo de números de tipo double cuyos valores se promediarán.
     * @return El promedio de los números proporcionados.
     * @throws IllegalArgumentException Si el arreglo está vacío.
     */
    public double calcularPromedio(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        double suma = 0;
        for (double num : numeros) {
            suma = sumar(suma, num);
        }
        return dividir(suma, numeros.length);
    }
}
