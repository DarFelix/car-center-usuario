package com.mycompany.car.center.db1.controller;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.car.center.db1.dao.UsuarioDaoImp;
import com.mycompany.car.center.db1.interfaz.IntUsuario;
import com.mycompany.car.center.db1.clase.Usuario;
import com.mycompany.car.center.db1.vista.VistaUsuario;


public class ControllerUsuario {
	
	private VistaUsuario vista = new VistaUsuario();
	
	public ControllerUsuario() {
		
	}
	
	//registro de usuario
	public void registrarUsuario(Usuario usuario) {
		IntUsuario dao = new UsuarioDaoImp();
		dao.registrar(usuario);
	}
	
	//lista de usuarios
	public void verUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		IntUsuario dao= new  UsuarioDaoImp();
		usuarios=dao.obtener();
		vista.verUsuarios(usuarios);
	}
	
	//actualizar usuarios
	public void actualizar(Usuario usuario) {
		IntUsuario dao= new  UsuarioDaoImp();
		dao.actualizar(usuario);
	}
	
	//eliminar usuarios
	public void eliminar(Usuario usuario) {
		IntUsuario dao= new  UsuarioDaoImp();
		dao.eliminar(usuario);
	}
	
	//ver usuario
	public void verUsuario(int id){
		Usuario usuario = new Usuario();
		IntUsuario dao= new  UsuarioDaoImp();
		usuario=dao.obteneru(usuario.getId());
		vista.verUsuario(usuario);
	}

}
