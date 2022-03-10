package ventanas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the v-grupoicono template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("v-grupoicono")
@JsModule("./src/ventanas/v-grupoicono.ts")
public class VGrupoicono extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("NombreDelGrupo")
	private Label nombreDelGrupo;
	@Id("AnadirFavoritos")
	private Button anadirFavoritos;
	@Id("EliminarGrupo")
	private Button eliminarGrupo;
	@Id("ImagenDelGrupo")
	private Image imagenDelGrupo;

	/**
     * Creates a new VGrupoicono.
     */
    public VGrupoicono() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getNombreDelGrupo() {
		return nombreDelGrupo;
	}

	public void setNombreDelGrupo(Label nombreDelGrupo) {
		this.nombreDelGrupo = nombreDelGrupo;
	}

	public Button getAnadirFavoritos() {
		return anadirFavoritos;
	}

	public void setAnadirFavoritos(Button anadirFavoritos) {
		this.anadirFavoritos = anadirFavoritos;
	}

	public Button getEliminarGrupo() {
		return eliminarGrupo;
	}

	public void setEliminarGrupo(Button eliminarGrupo) {
		this.eliminarGrupo = eliminarGrupo;
	}

	public Image getImagenDelGrupo() {
		return imagenDelGrupo;
	}

	public void setImagenDelGrupo(Image imagenDelGrupo) {
		this.imagenDelGrupo = imagenDelGrupo;
	}

}
