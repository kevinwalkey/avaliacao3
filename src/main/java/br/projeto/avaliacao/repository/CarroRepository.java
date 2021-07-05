package br.projeto.avaliacao.repository;

import br.projeto.avaliacao.controller.Dto.CarroDto;
import br.projeto.avaliacao.objeto.Carro;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository <Carro, Long> {

    List<Carro> findByNome(String nome);

    List<Carro> findByCor(String cor);

    List<Carro> findByMarca(String marca);

    @Query("SELECT c FROM Carro c WHERE valor = (SELECT max(valor) FROM Carro)")
    List<Carro> findByMaior();

    @Query("SELECT c FROM Carro c WHERE valor = (SELECT min(valor) FROM Carro)")
    List<Carro> findByMenor();

    @Query("SELECT c FROM Carro c ORDER BY c.nome ASC")
    List<Carro> orderByNome();

    @Query("SELECT c FROM Carro c ORDER BY c.valor DESC")
    List<Carro> orderByValor();

    @Query("SELECT c FROM Carro c ORDER BY c.ano DESC")
    List<Carro> orderByAno();
}
