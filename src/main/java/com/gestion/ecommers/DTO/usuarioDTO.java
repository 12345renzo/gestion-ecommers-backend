/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.ecommers.DTO;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class usuarioDTO {
    private long idusuario;
    private String nombre;
    private String apelliPa;
    private String apelliMa;
    private String telefono;
    private String correo;
    private String direccion;
    private String usuario;
    private String password;// Omitimos la contraseña por razones de seguridad
    private Date fechaCreacion;
    private int estado;
    private String rol;

    public usuarioDTO(long idusuario, String nombre, String apelliPa, String apelliMa, String telefono, String correo, String direccion, String usuario, String password, Date fechaCreacion, int estado, String rol) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apelliPa = apelliPa;
        this.apelliMa = apelliMa;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = usuario;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.rol = rol;
    }

    public usuarioDTO(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }
    
    public usuarioDTO() {
    }
}
