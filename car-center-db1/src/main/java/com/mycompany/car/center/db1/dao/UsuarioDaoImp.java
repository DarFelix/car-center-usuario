package com.mycompany.car.center.db1.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.car.center.db1.util.ConnectionUtil;
import com.mycompany.car.center.db1.interfaz.IntUsuario;
import com.mycompany.car.center.db1.clase.Usuario;




public class UsuarioDaoImp implements IntUsuario {

	@Override
	public boolean registrar(Usuario usuario) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO usuario values ("+usuario.getId()+",'"+usuario.getCedula()+"','"+usuario.getNombre()+"','"+usuario.getApellido()+"',"+usuario.getEdad()+",'"+usuario.getLicencia()+"')";
		
		try {			
			con=ConnectionUtil.getConnection();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuarioDaoImp, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
	
	@Override
	public List<Usuario> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM USUARIO ORDER BY ID";
		
		List<Usuario> listaUsuario= new ArrayList<Usuario>();
		
		try {			
			co= ConnectionUtil.getConnection();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c=new Usuario();
				c.setId(rs.getInt(1));
				c.setCedula(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setApellido(rs.getString(4));
				c.setEdad(rs.getInt(5));
				c.setLicencia(rs.getString(6));
				
				listaUsuario.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuarioDaoImp, método obtener");
			e.printStackTrace();
		}
		
		return listaUsuario;
	}
	
	
	@Override
	public boolean actualizar(Usuario usuario) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE USUARIO SET cedula='"+usuario.getCedula()+"', nombre='"+usuario.getNombre()+
				"', apellido='"+usuario.getApellido()+"'"+", edad="+usuario.getEdad()+", licencia='"+
				usuario.getLicencia()+"' WHERE ID="+usuario.getId();
		try {
			connect=ConnectionUtil.getConnection();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuarioDaoImp, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
	
	@Override
	public boolean eliminar(Usuario usuario) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM USUARIO WHERE ID="+usuario.getId();
		try {
			connect=ConnectionUtil.getConnection();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuarioDaoImp, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
	

	@Override
	public Usuario obteneru(int id) {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		Usuario usuario= new Usuario();
		
		
		String sql="SELECT * FROM USUARIO WHERE id="+usuario.getId();
		
		
		
		try {			
			co= ConnectionUtil.getConnection();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			if (rs.next()) {
				
				usuario.setId(rs.getInt(1));
				usuario.setCedula(rs.getString(2));
				usuario.setNombre(rs.getString(3));
				usuario.setApellido(rs.getString(4));
				usuario.setEdad(rs.getInt(5));
				usuario.setLicencia(rs.getString(6));
				
				
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuarioDaoImp, método obteneru");
			e.printStackTrace();
		}
		
		return usuario;
	}
	
}
