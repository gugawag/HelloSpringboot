package com.gugawag.progdistri.service;

import com.gugawag.progdistri.dao.UsuariosDAO;
import com.gugawag.progdistri.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuariosService {

    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios(){
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo){
        return usuariosDAO.getUsuarios().stream().filter(usuario -> usuario.getCodigo()==codigo).collect(
                Collectors.toList()).get(0);
    }

    public void inserirUsuario(Usuario usuario){
        this.usuariosDAO.inserirUsuario(usuario);
    }

}
