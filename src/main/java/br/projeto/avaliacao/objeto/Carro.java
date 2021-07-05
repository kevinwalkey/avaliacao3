package br.projeto.avaliacao.objeto;

import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.Year;

@Entity
public class Carro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chassi;
    private String nome;
    private String marca;
    private String cor;
    private BigDecimal valor;
    private int ano;

    public Carro(){

    }

    public Carro(String chassi, String nome, String marca, String cor, BigDecimal valor, int ano){
        this.chassi = chassi;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
        this.ano = ano;
    }

    public Carro(String chassi, String nome, String marca, String cor, BigDecimal valor, Year ano) {
    }

    public Long getId() { return id;  }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
