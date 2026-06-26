package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    // Definindo a URL (rota) do site
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

}
