package interfazusuario;

import ventanas.VGrupoicono;

public class GrupoAdministrador extends VGrupoicono {

	
	public GrupoAdministrador(){
		
		this.getAnadirFavoritos().setVisible(false);
	}
	
	public void grupo(String nombre, String imagen) {
		
		this.getNombreDelGrupo().setText(nombre);
		this.getImagenDelGrupo().setSrc(imagen);
	}
}



