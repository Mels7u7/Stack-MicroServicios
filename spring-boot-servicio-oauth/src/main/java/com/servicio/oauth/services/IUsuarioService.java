package com.servicio.oauth.services;

import com.servicio.commons.usuarios.model.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
