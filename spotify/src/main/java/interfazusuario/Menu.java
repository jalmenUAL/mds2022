package interfazusuario;

import ventanas.VMenu;

public class Menu extends VMenu {

	
	public Menu() {
		
		this.getEntrar().setVisible(false);
		this.getNick().setVisible(false);
		this.getPassword().setVisible(false);
		this.getSalir().setVisible(false);
		
	}
	
}
