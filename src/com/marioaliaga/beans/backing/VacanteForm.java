package com.marioaliaga.beans.backing;

import com.marioaliaga.beans.model.Candidato;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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
}
