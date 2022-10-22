package com.appbuelito.appbuelito.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appbuelito.appbuelito.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public List<Usuario> findByUsr(String usr);
}
