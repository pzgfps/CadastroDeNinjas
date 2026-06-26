package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface que faz a conexão/tradução do programa em Java para SQL
@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> { // Classe e o tipo de dado do ID (Long)



}
