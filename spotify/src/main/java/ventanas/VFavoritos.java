package ventanas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the v-favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("v-favoritos")
@JsModule("./src/ventanas/v-favoritos.ts")
public class VFavoritos extends LitTemplate {

    @Id("label")
	private Label label;

	/**
     * Creates a new VFavoritos.
     */
    public VFavoritos() {
        // You can initialise any data required for the connected UI components here.
    }

}
