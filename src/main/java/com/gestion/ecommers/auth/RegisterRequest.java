/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.ecommers.auth;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Humberto
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    String nombre;
    String apelliPa;
    String apelliMa;
    String telefono;
    String correo;
    String direccion;
    String usuario;
    String password;
    Date fechaCreacion;
    int estado;
}
