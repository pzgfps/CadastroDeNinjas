package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaRepository ninjaRepository;
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService, NinjaRepository ninjaRepository) {
        this.ninjaService = ninjaService;
        this.ninjaRepository = ninjaRepository;
    }

    // Definindo a URL (rota) do site
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nesta rota";
    }

    // Adicionar novo Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorID(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.alterarNinjaPorID(id, ninjaAtualizado);
    }

    // Deletar ninja (DELETE) - É necessário colocar o id que o usuario deseja deletar na URL (@PathVariable)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id) {
        ninjaService.deletarNinjaPorID(id);
    }


}
