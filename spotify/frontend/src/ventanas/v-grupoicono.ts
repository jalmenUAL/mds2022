import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('v-grupoicono')
export class VGrupoicono extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" theme="spacing-s">
 <img id="ImagenDelGrupo" style="width: 100%; height: 100%;" src="https://imagenes.elpais.com/resizer/FIvjdao7WcFxKgUH2SbGtx4mdDU=/414x0/cloudfront-eu-central-1.images.arcpublishing.com/prisa/S2K7YJBNRPTE3VOQ7ZIUXFRRVQ.jpg"/img>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <label id="NombreDelGrupo" style="width: 100%;">Nombre del Grupo</label>
  <vaadin-button id="AnadirFavoritos" style="width: 100%;">
    Añadir a Favoritos 
  </vaadin-button>
  <vaadin-button id="EliminarGrupo" style="width: 100%;">
    Eliminar Grupo 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
