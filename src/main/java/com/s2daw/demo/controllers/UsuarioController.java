package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(111L);
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");

        Usuario usuario2 = new Usuario();
        usuario2.setId(222L);
        usuario2.setNombre("Sheila");
        usuario2.setApellido("Corrales");
        usuario2.setEmail("sheilacgarcia@gmail.com");
        usuario2.setTelefono("684356722");

        Usuario usuario3 = new Usuario();
        usuario3.setId(333L);
        usuario3.setNombre("Alvaro");
        usuario3.setApellido("Adanez");
        usuario3.setEmail("alvaroah15@gmail.com");
        usuario3.setTelefono("693465238");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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

    @RequestMapping(value="usuario22")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ángel");
        usuario.setApellido("Martínez");
        usuario.setEmail("angelmartinezhu@gmail.com");
        usuario.setTelefono("673415718");
        return usuario;
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
