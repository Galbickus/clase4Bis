/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4bis;

import lombok.Data;


/**
 *
 * @author ASUS
 */
//NO OLVIDAR LA NOTACION @Data 
@Data
public class Alumno {
    private String nombre;
    private String apellido;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
}
