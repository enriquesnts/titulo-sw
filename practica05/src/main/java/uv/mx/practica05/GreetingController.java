package main.java.uv.mx.practica05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/saludar")
    public String saludar(@RequestParam(value = "nombre", defaultValue = "Enrique") String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/despedirse")
    public String despedirse(@RequestParam(value = "nombre", defaultValue = "Enrique") String nombre) {
        return "Adiós " + nombre;
    }
}

