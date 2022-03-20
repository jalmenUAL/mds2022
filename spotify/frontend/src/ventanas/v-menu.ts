import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

@customElement('v-menu')
export class VMenu extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
    		width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout class="sidebar" flex-shrink: 0; background-color: var(--lumo-contrast-5pct);" id="vaadinVerticalLayout" style="width: 150pt;">
  <vaadin-button id="Login" style="width: 100%;">
    Login 
  </vaadin-button>
  <vaadin-button id="Buscar" style="width: 100%;">
    Buscar 
  </vaadin-button>
  <vaadin-button id="Bibilioteca" style="width: 100%;">
    Biblioteca 
  </vaadin-button>
  <vaadin-button id="Favoritos" style="width: 100%;">
    Favoritos 
  </vaadin-button>
  <vaadin-button id="Mes" style="width: 100%;">
    Grupos del Mes 
  </vaadin-button>
  <vaadin-button id="Salir" style="width: 100%;">
    Salir 
  </vaadin-button>
  <vaadin-text-field label="Login" placeholder="Introduzca el Nick" id="Nick" style="width: 100%;"></vaadin-text-field>
  <vaadin-password-field label="Password" placeholder="Introduzca el Password" value="secret1" id="Password" has-value style="width: 100%;"></vaadin-password-field>
  <vaadin-button id="Entrar" style="width: 100%;">
    Entrar 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto; width: 100%; height: 100%;" id="vaadinVerticalLayout1"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
