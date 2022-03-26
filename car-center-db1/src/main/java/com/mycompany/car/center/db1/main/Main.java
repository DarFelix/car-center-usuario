package com.mycompany.car.center.db1.main;

import com.mycompany.car.center.db1.controller.ControllerUsuario;

import java.util.Scanner;

import com.mycompany.car.center.db1.clase.Usuario;

public class Main {

	
	public static void consultar() {
		System.out.println("Listado de usuarios");
		ControllerUsuario controller = new ControllerUsuario();
		controller.verUsuarios();
	}
	
	public static void guardar() {
		ControllerUsuario controller = new ControllerUsuario();
		System.out.println("Ingrese los datos del usuario a guardar");
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		Scanner nm = new Scanner(System.in);
		Scanner nom = new Scanner(System.in); 
		Scanner ape = new Scanner(System.in); 
		Scanner lic = new Scanner(System.in); 
		
		System.out.println("Digite el id: ");
        int id = sc.nextInt();
        System.out.println("El id es: " + id);
        System.out.println("--------------- ");
        
        System.out.println("Digite la cédula: ");
        String cedula = nm.nextLine();
        System.out.println("La cédula es: " + cedula);
        System.out.println("--------------- ");
        
        System.out.println("Digite el nombre: ");
        String nombre = nom.nextLine();
        System.out.println("El nombre es: " + nombre);
        System.out.println("--------------- ");
        
        System.out.println("Digite el apellido ");
        String apellido = ape.nextLine();
        System.out.println("El apellido es: " + apellido);
        System.out.println("--------------- ");
        
        System.out.println("Digite la edad: ");
        int edad = nm.nextInt();
        System.out.println("La edad es: " + edad);
        System.out.println("--------------- ");
		
        System.out.println("Digite la licencia: ");
        String licencia = lic.nextLine();
        System.out.println("La licencia es: " + licencia);
        System.out.println("--------------- ");
		
       
        usuario.setId(id);
        usuario.setCedula(cedula);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEdad(edad);
        usuario.setLicencia(licencia);
     
        controller.registrarUsuario(usuario);
        System.out.println("Usuario creado con éxito ");
	}
	
	public static void modificar() {
		
		ControllerUsuario controller = new ControllerUsuario();
		System.out.println("Ingrese los datos del usuario a modificar");
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		Scanner nm = new Scanner(System.in);
		Scanner nom = new Scanner(System.in); 
		Scanner ape = new Scanner(System.in); 
		Scanner lic = new Scanner(System.in); 
		
		System.out.println("Digite el id: ");
        int id = sc.nextInt();
        System.out.println("El id es: " + id);
        System.out.println("--------------- ");
        
        System.out.println("Digite la cédula: ");
        String cedula = nm.nextLine();
        System.out.println("La cédula es: " + cedula);
        System.out.println("--------------- ");
        
        System.out.println("Digite el nombre: ");
        String nombre = nom.nextLine();
        System.out.println("El nombre es: " + nombre);
        System.out.println("--------------- ");
        
        System.out.println("Digite el apellido ");
        String apellido = ape.nextLine();
        System.out.println("El apellido es: " + apellido);
        System.out.println("--------------- ");
        
        System.out.println("Digite la edad: ");
        int edad = nm.nextInt();
        System.out.println("La edad es: " + edad);
        System.out.println("--------------- ");
		
        System.out.println("Digite la licencia: ");
        String licencia = lic.nextLine();
        System.out.println("La licencia es: " + licencia);
        System.out.println("--------------- ");
		
       
        usuario.setId(id);
        usuario.setCedula(cedula);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEdad(edad);
        usuario.setLicencia(licencia);
        
        controller.actualizar(usuario);
        System.out.println("Usuario actualizado con éxito ");
		
		
	}
	
	public static void eliminar() {
		ControllerUsuario controller = new ControllerUsuario();
		System.out.println("Ingrese el id del usuario que quiere eliminar");
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite el id: ");
        int id = sc.nextInt();
        usuario.setId(id);
        
        
        controller.eliminar(usuario);
        
        System.out.println("Usuario borrado con éxito");
		
		
	}
	
	public static void obtenerus() {
		ControllerUsuario controller = new ControllerUsuario();
		System.out.println("Ingrese el id del usuario que quiere consultar:");
		Usuario usuario = new Usuario();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el id: ");
        int id = sc.nextInt();
		usuario.setId(id);
		
		controller.verUsuario(id);
	}
	
	public static void main(String[] args) {
		
		int rta;
		
		//controlador
		ControllerUsuario controller = new ControllerUsuario();
		
		do {
		
		System.out.println("CRUD para operaciones en la base de datos PostgreSQL");
		
		Scanner sc = new Scanner(System.in);
		Scanner tecla = new Scanner(System.in);
		System.out.println("Escoja una opción entre las siguientes:");
		System.out.println("1. Consultar");
		System.out.println("2. Guardar");
		System.out.println("3. Modificar");
		System.out.println("4. Eliminar");
		System.out.println("5. Ver usuario");
		
		
		int opcion = sc.nextInt();
		
		
		
		switch (opcion)
		{
		case 1: consultar();
				break;
		case 2: guardar();
				break;
		case 3: modificar();
				break;
		case 4: eliminar();
				break;
		case 5: obtenerus();
				break;
		
		default: System.out.println("Seleccione una opción válida");
				break;
		}
		
		System.out.print("\n¿Quiere seguir?\n");
		System.out.print("\nPresiona 1 para continuar...\n");
		
		rta = tecla.nextInt();
		
		}while(rta == 1);
	
	
	}
	
}

			
			