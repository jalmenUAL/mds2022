package ventanas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Div;

/**
 * A Designer generated component for the v-grupo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("v-grupo")
@JsModule("./src/ventanas/v-grupo.ts")
public class VGrupo extends LitTemplate {

    @Id("img")
	private Image img;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("div")
	private Div div;
	@Id("label2")
	private Label label2;

	/**
     * Creates a new VGrupo.
     */
    public VGrupo() {
        // You can initialise any data required for the connected UI components here.
    }

}
