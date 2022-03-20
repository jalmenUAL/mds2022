package interfazusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NoRegistrado extends Menu {

	
	public NoRegistrado() {
		
		this.getBibilioteca().setVisible(false);
		this.getFavoritos().setVisible(false);
		this.getMes().setVisible(false);
		this.getBuscar().setVisible(false);
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(new GrupoNoRegistrado());
	}
}
