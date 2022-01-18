import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('v-grupo')
export class VGrupo extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayout">
 <img id="img" style="width: 100%; height: 300pt;" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQebEY3Lpe-gOHj8TO_3h0_oXj4mj2JN3z50w&amp;usqp=CAU">
 <label id="label" style="font-family: Arial, Helvetica, sans-serif; font-size: 40px; align-self: center;color:white;">ACDC</label>
 <label id="label1" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center;color:white;">Canciones más populares </label>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%; align-self: center;">
  <label id="label2" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center; color:white; width: 100%; height: 100%;">Black in Black</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; height: 100%; align-self: center;">
  <label id="label2" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center; color:white; width: 100%; height: 100%;">Highway to Hell</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 100%; height: 100%; align-self: center;">
  <label id="label2" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center; color:white; width: 100%; height: 100%;">Thunderstruck</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; height: 100%; align-self: center;">
  <label id="label2" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center; color:white; width: 100%; height: 100%;">T.N.T.</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 100%; height: 100%; align-self: center;">
  <label id="label2" style="font-family: Arial, Helvetica, sans-serif; font-size: 20px; align-self: center; color:white; width: 100%; height: 100%;">Hells Bells</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
