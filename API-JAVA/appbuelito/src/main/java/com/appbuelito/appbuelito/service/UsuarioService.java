package com.appbuelito.appbuelito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appbuelito.appbuelito.entity.Usuario;
import com.appbuelito.appbuelito.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usrRepository;  
    
    public Usuario buscarUsuario(String usr){
        return (Usuario) usrRepository.findByUsr(usr);
    }


}
