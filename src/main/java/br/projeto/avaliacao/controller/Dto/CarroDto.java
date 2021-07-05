package br.projeto.avaliacao.controller.Dto;

import br.projeto.avaliacao.objeto.Carro;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class CarroDto {
    private Long id;
    private String chassi;
    private String nome;
    private String marca;
    private String cor;
    private BigDecimal valor;
    private int ano;

    public CarroDto(Carro carro) {
        this.id = carro.getId();
        this.nome = carro.getNome();
        this.marca = carro.getMarca();
        this.cor = carro.getCor();
        this.valor = carro.getValor();
        this.ano = carro.getAno();
    }

    public CarroDto( CarroDto carroDto ) {

    }

    public Long getId() {
        return id;
    }

    public String getChassi() {
        return chassi;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getAno() {
        return ano;
    }

    public static List<CarroDto> converter( List<Carro> carros) {
        return carros.stream().map(CarroDto::new).collect(Collectors.toList());
    }

}
