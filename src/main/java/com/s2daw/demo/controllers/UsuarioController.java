package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");
        return usuario;
    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);

    }

    @RequestMapping(value="usuario12")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");
        return usuario;
    }

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value="usuario32")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");
        return usuario;
    }
}
