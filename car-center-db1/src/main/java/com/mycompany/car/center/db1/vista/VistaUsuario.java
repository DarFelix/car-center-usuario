package com.mycompany.car.center.db1.vista;

import java.util.List;
import com.mycompany.car.center.db1.clase.Usuario;

public class VistaUsuario {

	public void verUsuario(Usuario usuario) {
		System.out.println("Datos del usuario: "+usuario);
	}
	
	public void verUsuarios(List<Usuario> usuarios) {
		for(Usuario usuario : usuarios) {
			System.out.println("Datos del usuario: "+usuario);
		}
	}
	
}
