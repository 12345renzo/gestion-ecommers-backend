package com.gestion.ecommers.service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.gestion.ecommers.DTO.usuarioDTO;
import com.gestion.ecommers.auth.AuthResponse;
import com.gestion.ecommers.modelos.Usuario;
import com.gestion.ecommers.repositorio.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    
    private final UsuarioRepositorio userRepositorio;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    
    //aki se puede usar el request pero uso mejor el dto 
    public AuthResponse login (usuarioDTO dato){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dato.getUsuario(),dato.getPassword()));
        Usuario user = userRepositorio.findByUsuario(dato.getUsuario()).orElseThrow();
        String token = 
    }
}
