package Martillito.modelo.adm;
//definir que compartamiento(metodos) puedo tener una clase 

import Martillito.modelo.vo.Usuario;

public interface UsuarioRepositorio {
    Usuario login(String dni, String clave);
}
