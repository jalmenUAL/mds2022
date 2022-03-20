package interfazusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ventanas.VInicio;
import ventanas.VMenu;

public class Administrador extends Menu {
	
	public Administrador() {
		
		this.getBibilioteca().setVisible(false);
		this.getFavoritos().setVisible(false);
		this.getLogin().setVisible(false);
		this.getMes().setVisible(false);
		this.getSalir().setVisible(true);
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(new GrupoAdministrador());
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(new GrupoAdministrador());
		
	}

}
