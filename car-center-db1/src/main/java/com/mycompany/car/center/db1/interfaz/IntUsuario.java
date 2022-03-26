package com.mycompany.car.center.db1.interfaz;

import java.util.List;
import com.mycompany.car.center.db1.clase.Usuario;

public interface IntUsuario {
	public boolean registrar(Usuario usuario);
	public List<Usuario> obtener();
	public boolean actualizar(Usuario usuario);
	public boolean eliminar(Usuario usuario);
	
	public Usuario obteneru(int id);
}

