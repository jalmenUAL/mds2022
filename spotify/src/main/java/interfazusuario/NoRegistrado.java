package interfazusuario;

public class NoRegistrado extends Menu {

	
	public NoRegistrado() {
		
		this.getBibilioteca().setVisible(false);
		this.getFavoritos().setVisible(false);
		this.getMes().setVisible(false);
		this.getBuscar().setVisible(false);
	}
}
