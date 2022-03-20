package interfazusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Registrado extends Menu {

	
	public Registrado() {
		
		this.getLogin().setVisible(false);
		this.getSalir().setVisible(true);
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(new GrupoRegistrado());
		
	}
}
