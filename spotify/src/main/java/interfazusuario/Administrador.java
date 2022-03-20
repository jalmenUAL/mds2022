package interfazusuario;

import ventanas.VInicio;
import ventanas.VMenu;

public class Administrador extends Menu {
	
	public Administrador() {
		
		this.getBibilioteca().setVisible(false);
		this.getFavoritos().setVisible(false);
		this.getLogin().setVisible(false);
		this.getMes().setVisible(false);
		this.getSalir().setVisible(true);
	}

}
