package ventanas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
	@Id("label2")
	private Label label2;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	/**
     * Creates a new VGrupo.
     */
    public VGrupo() {
    	
    	spotify.AudioPlayer player=new spotify.AudioPlayer();
    	player.setSource("https://radioteca.net/media/uploads/audios/%25Y_%25m/back%20in%20black-acdc.mp3");
    	spotify.AudioPlayer player2=new spotify.AudioPlayer();
    	player2.setSource("https://radioteca.net/media/uploads/audios/%25Y_%25m/back%20in%20black-acdc.mp3");
    	spotify.AudioPlayer player3=new spotify.AudioPlayer();
    	player3.setSource("https://radioteca.net/media/uploads/audios/%25Y_%25m/back%20in%20black-acdc.mp3");
    	spotify.AudioPlayer player4=new spotify.AudioPlayer();
    	player4.setSource("https://radioteca.net/media/uploads/audios/%25Y_%25m/back%20in%20black-acdc.mp3");
    	spotify.AudioPlayer player5=new spotify.AudioPlayer();
    	player5.setSource("https://radioteca.net/media/uploads/audios/%25Y_%25m/back%20in%20black-acdc.mp3");
    	vaadinHorizontalLayout.add(player);
    	vaadinHorizontalLayout2.add(player2);
    	vaadinHorizontalLayout3.add(player3);
    	vaadinHorizontalLayout4.add(player4);
    	vaadinHorizontalLayout5.add(player5);
    	 player.getElement().getStyle().set("width", "100%");
    	 player.getElement().getStyle().set("height", "100%");
    	 player2.getElement().getStyle().set("width", "100%");
    	 player2.getElement().getStyle().set("height", "100%");
    	 player3.getElement().getStyle().set("width", "100%");
    	 player3.getElement().getStyle().set("height", "100%");
    	 player4.getElement().getStyle().set("width", "100%");
    	 player4.getElement().getStyle().set("height", "100%");
    	 player5.getElement().getStyle().set("width", "100%");
    	 player5.getElement().getStyle().set("height", "100%");
        // You can initialise any data required for the connected UI components here.
    }

}
