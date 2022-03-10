package ventanas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the v-menu template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("v-menu")
@JsModule("./src/ventanas/v-menu.ts")
public class VMenu extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("Login")
	private Button login;
	@Id("Buscar")
	private Button buscar;
	@Id("Bibilioteca")
	private Button bibilioteca;
	@Id("Favoritos")
	private Button favoritos;
	@Id("Mes")
	private Button mes;
	@Id("Password")
	private PasswordField password;
	@Id("Salir")
	private Button salir;
	@Id("Nick")
	private TextField nick;
	@Id("Entrar")
	private Button entrar;

	/**
     * Creates a new VMenu.
     */
    public VMenu() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getLogin() {
		return login;
	}

	public void setLogin(Button login) {
		this.login = login;
	}

	public Button getBuscar() {
		return buscar;
	}

	public void setBuscar(Button buscar) {
		this.buscar = buscar;
	}

	public Button getBibilioteca() {
		return bibilioteca;
	}

	public void setBibilioteca(Button bibilioteca) {
		this.bibilioteca = bibilioteca;
	}

	public Button getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Button favoritos) {
		this.favoritos = favoritos;
	}

	public Button getMes() {
		return mes;
	}

	public void setMes(Button mes) {
		this.mes = mes;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public Button getSalir() {
		return salir;
	}

	public void setSalir(Button salir) {
		this.salir = salir;
	}

	public TextField getNick() {
		return nick;
	}

	public void setNick(TextField nick) {
		this.nick = nick;
	}

	public Button getEntrar() {
		return entrar;
	}

	public void setEntrar(Button entrar) {
		this.entrar = entrar;
	}

}
