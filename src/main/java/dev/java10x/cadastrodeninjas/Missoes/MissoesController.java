package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private final MissoesRepository missoesRepository;
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService, MissoesRepository missoesRepository) {
        this.missoesService = missoesService;
        this.missoesRepository = missoesRepository;
    }

    // Adicionar nova Missão (CREATE)
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    // Mostrar todas as missões (READ)
    @GetMapping("/listar")
    public List<MissoesModel> mostrarTodasAsMissoes() {
        return missoesService.ListarMissoes();
    }

    // Mostrar missão por ID (READ)
    @GetMapping("/listar/{id}")
    public MissoesModel mostrarMissaoPorID(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    // Alterar dados da missão (UPDATE)
    @PutMapping("/alterar")
    public String alterarMissaoPorID() {
        return "Alterando missão por ID";
    }

    // Deletar missão (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarMissaoPorID() {
        return "Deletando missão por ID";
    }
}