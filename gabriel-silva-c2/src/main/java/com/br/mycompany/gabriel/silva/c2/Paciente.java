/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mycompany.gabriel.silva.c2;

/**
 *
 * @author Gabriel Reis
 */
public class Paciente {

    private Integer idPaciente;
    private String nome, doenca;
    private boolean estaInternado;
    private Double valorCirurgia;
    private Double valorDiaria;
    private Integer qtdDias;
    private boolean foiOperado;
    private Double total;

    public void calcularValorTotal(Paciente pac) {
        
        total = (pac.getValorDiaria() * pac.getQtdDias()) + pac.getValorCirurgia();

    }


    public Double getTotal() {
        return total;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public boolean isEstaInternado() {
        return estaInternado;
    }

    public void setEstaInternado(boolean estaInternado) {
        this.estaInternado = estaInternado;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Integer getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    public boolean isFoiOperado() {
        return foiOperado;
    }

    public void setFoiOperado(boolean foiOperado) {
        this.foiOperado = foiOperado;
    }

    
    
}
