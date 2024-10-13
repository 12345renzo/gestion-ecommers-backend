/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.ecommers.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Humberto
 */

@Builder
@AllArgsConstructor //genera el constructor
@NoArgsConstructor //este constructor no recibe parametro
@Data //genera geter y seter
@Entity //este ase llamar a la entidad
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = {"usuario"}))
public class Usuario implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private long idusuario;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apelliPa")
    private String apelliPa;
    
    @Column(name = "apelliMa")
    private String apelliMa;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    
    @Column(name = "estado")
    private int estado;
   
    //aki le digo que muchos usuarios tendran un solo rol
    @ManyToOne
    @JoinColumn(name = "idrol", referencedColumnName = "idrol")
    private Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(rol.getRols()));
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    } 
}