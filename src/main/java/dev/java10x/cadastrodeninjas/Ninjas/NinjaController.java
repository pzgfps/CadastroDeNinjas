package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Definindo a URL (rota) do site
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

    // Adicionar novo Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() { return "Ninja criado!";}

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() { return "Ninjas por ID"; }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorID() { return "Alterando ninja por ID"; }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() { return "Deletando ninja por ID"; }

}
