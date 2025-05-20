package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class PasDeVoitureException extends RuntimeException {

    public PasDeVoitureException() {
        super("Pas de voiture pour calculer les statistiques");
    }
}
