package com.example.a533.exercice_de_rvision_examen_final;

import android.widget.Button;

public class JobOfferModel {
    String titrePoste;
    String description;
    Float salaire;
    Button delete;

    public JobOfferModel(String titrePoste, String description, Float salaire) {
        this.titrePoste = titrePoste;
        this.description = description;
        this.salaire = salaire;
        this.delete = delete;
    }


    public String getTitrePoste() {
        return titrePoste;
    }

    public String getDescription() {
        return description;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }

    public Button getDelete() {
        return delete.;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }
}
