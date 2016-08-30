package com.marioaliaga.beans.backing;

import com.marioaliaga.beans.model.Candidato;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;

/**
 * Created by maliaga on 8/19/16.
 */
@ManagedBean
@RequestScoped
public class VacanteForm {

    public VacanteForm() {
    }

    @ManagedProperty(value = "#{candidato}")
    private Candidato candidato;

    private boolean comentarioEnviado;

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Mario")) {
            if (this.candidato.getApellido().equals("Aliaga")) {
                String msg = "Ud ya trabaja con nosotros.";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                facesContext.addMessage(null, facesMessage);
                return "index";
            }
            return "success";
        } else {
            return "error";
        }
    }

    public void codigoPostalListener(ValueChangeEvent valueChangeEvent){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        String newCodigoPostal = (String) valueChangeEvent.getNewValue();

        if("123456".equals(newCodigoPostal)){
            UIInput ciudadUiInput = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
            String ciudad = "Santiago";
            ciudadUiInput.setValue(ciudad);
            ciudadUiInput.setSubmittedValue(ciudad);

            UIInput coloniaUiInput = (UIInput) uiViewRoot.findComponent("vacanteForm:colonia");
            String colonia = "Metropolitana";
            coloniaUiInput.setValue(colonia);
            coloniaUiInput.setSubmittedValue(colonia);

            facesContext.renderResponse();
        }

    }

    public void ocultarComentario(ActionEvent actionEvent){
        comentarioEnviado = !comentarioEnviado;
    }
}
