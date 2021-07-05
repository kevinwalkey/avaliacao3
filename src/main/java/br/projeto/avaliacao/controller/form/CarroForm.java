package br.projeto.avaliacao.controller.form;

import br.projeto.avaliacao.objeto.Carro;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CarroForm {

    @NotNull @NotEmpty
    private String chassi;
    @NotNull @NotEmpty
    private String nome;
    @NotNull @NotEmpty
    private String marca;
    @NotNull @NotEmpty
    private String cor;
    @NotNull @NotEmpty
    private BigDecimal valor;
    @NotNull @NotEmpty
    private int ano;

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

    public void setAno(int ano) { this.ano = ano; }

    public Carro converter() {
        return new Carro(chassi,nome,marca,cor,valor,ano);
    }
}

