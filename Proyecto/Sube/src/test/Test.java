package test;

import java.util.GregorianCalendar;

import dao.UsuarioDAO;
import datos.Contacto;
import datos.DatosUsuario;
import datos.Usuario;
import enums.Generos;
import enums.TipoDeDocumento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST GENEROS
		Contacto contacto = new Contacto("mail", "movil", "fijo");
		DatosUsuario datos = new DatosUsuario("nombre", "apellido", Generos.INDEFINIDO, contacto);
		Usuario usuario = new Usuario(TipoDeDocumento.DocumentoExtranjero, "documento", "clave",
				new GregorianCalendar(), datos);
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.agregar(usuario);
	
	}
	

}
