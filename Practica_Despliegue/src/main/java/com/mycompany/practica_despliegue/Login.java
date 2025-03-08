/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_despliegue;

/**
 *
 * @author alvar
 */
public class Login {
     public boolean autenticar(String usuario, String contraseña) {
        // Implementa la lógica de autenticación
        return usuario.equals("admin") && contraseña.equals("1234");
    }
}
