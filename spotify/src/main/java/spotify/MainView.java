package spotify;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfazusuario.Administrador;
import interfazusuario.GrupoAdministrador;
import interfazusuario.GrupoNoRegistrado;
import interfazusuario.NoRegistrado;
import interfazusuario.Registrado;
import ventanas.VGrupo;
import ventanas.VGrupoicono;
import ventanas.VInicio;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	
    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView() {
    	
  
    	 NoRegistrado v = new NoRegistrado();
    	 
    	 add(v);
    	 v.getStyle().set("height", "100%");
    	 v.getStyle().set("width", "100%");
    	 this.setSizeFull();
    	 
    	 
         
    	 
    	 v.getLogin().addClickListener(new ComponentEventListener() {

 			@Override
 			public void onComponentEvent(ComponentEvent event) {
 				// TODO Auto-generated method stub
 				
 				v.getNick().setVisible(true);
 				v.getPassword().setVisible(true);
 				v.getEntrar().setVisible(true);
 				
 				
 		    	
 		    	v.getEntrar().addClickListener(new ComponentEventListener() {
 		    		
 		    		@Override
 		 			public void onComponentEvent(ComponentEvent event) {
 		 				// TODO Auto-generated method stub
 		    		
 		    		
 		    	    if (v.getNick().getValue().equals("admin")) {
 		    	    	
 		    	    	Administrador gc = new Administrador();
 		    	    	remove(v);	
 		    	    	add(gc);
 		    	    	gc.getStyle().set("height", "100%");
 		 		    	gc.getStyle().set("width", "100%");
 		 		    	
 		    	    	
 		    	    }
 		    	    else if (v.getNick().getValue().equals("registrado")) {
 		    	    	
 		    	    	Registrado gc = new Registrado();
 		    	    	remove(v); 
 		    	    	add(gc);
 		    	    	gc.getStyle().set("height", "100%");
 		 		    	gc.getStyle().set("width", "100%");
 		    	    	 
 		    	        
 		    	    } else {
 		    	    	Notification.show("Usuario no conocido");
 		    	    }
 		    		}
 		    	});
 				
 			}
 		});
    	 
    	
         
         
         
         
     }
 
       
       
        
    

}
