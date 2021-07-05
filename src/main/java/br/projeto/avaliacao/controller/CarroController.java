package br.projeto.avaliacao.controller;

import br.projeto.avaliacao.controller.Dto.CarroDto;
import br.projeto.avaliacao.controller.form.CarroForm;
import br.projeto.avaliacao.objeto.Carro;
import br.projeto.avaliacao.repository.CarroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@Api(value="API REST Avaliacao")
@CrossOrigin(origins = "*")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping("/cars")
    @ApiOperation(value="Cadastra o carro")
    public void cadastrar( @RequestBody CarroForm form ) {
        Carro carro = form.converter();
        carroRepository.save(carro);
    }

    @GetMapping(value = "/marca")
    @ApiOperation(value="Retorna o carro procurado por marca")
    public List<CarroDto> listMarca (String marca){
        List<Carro> carroMarca = carroRepository.findByMarca(marca);
        return CarroDto.converter(carroMarca);
    }

    @GetMapping(value = "/nome")
    @ApiOperation(value="Retorna o carro procurado por nome")
    public List<CarroDto> listNome (String nome){
        List<Carro> carroNome = carroRepository.findByNome(nome);
        return CarroDto.converter(carroNome);
    }

    @GetMapping(value = "/cor")
    @ApiOperation(value="Retorna o carro procurado por cor")
    public List<CarroDto> listCor (String cor){
        List<Carro> carroCor = carroRepository.findByCor(cor);
        return CarroDto.converter(carroCor);
    }

    @GetMapping("/maior")
    @ApiOperation(value="Retorna o carro com maior valor")
    public List<Carro> listaMaior(){
        return carroRepository.findByMaior();
    }

    @GetMapping("/menor")
    @ApiOperation(value="Retorna o carro com menor valor")
    public List<Carro> listaMenor(){
        return carroRepository.findByMenor();
    }

    @GetMapping("/ordenaNome")
    @ApiOperation(value="Retorna uma lista por ordem alfabetica")
    public List<Carro> listaOrdenaNome(){
        return carroRepository.orderByNome();
    }

    @GetMapping("/ordenaValor")
    @ApiOperation(value="Retorna uma lista por ordem crescente do valor")
    public List<Carro> listaOrdenaValor(){
        return carroRepository.orderByValor();
    }

    @GetMapping("/ordenaAno")
    @ApiOperation(value="Retorna uma lista por ordem crescente do ano")
    public List<Carro> listaOrdenaAno(){
        return carroRepository.orderByAno();
    }


}