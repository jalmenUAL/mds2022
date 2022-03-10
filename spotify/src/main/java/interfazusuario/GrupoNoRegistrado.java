package interfazusuario;

import ventanas.VGrupoicono;

public class GrupoNoRegistrado extends VGrupoicono {

	
public GrupoNoRegistrado(){
		
		this.getEliminarGrupo().setVisible(false);
		this.getAnadirFavoritos().setVisible(false);
	}
}
