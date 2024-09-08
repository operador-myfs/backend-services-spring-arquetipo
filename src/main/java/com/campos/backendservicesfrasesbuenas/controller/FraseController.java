package com.campos.backendservicesarquetiposprint.controller;

import com.campos.backendservicesarquetiposprint.service.FraseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FraseController {

    private final FraseService fraseService;

    @GetMapping("/generar-frase")
    public String generarFrase() {
        return fraseService.generarFrase();
    }

}
