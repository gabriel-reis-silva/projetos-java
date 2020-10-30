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
public class Hospital {

    Integer internacoesRealizadas = 0;
    Integer cirurgiasRealizadas = 0;
    Integer altasRealizadas = 0;
    String resultado;

    public void registraInternacao(Paciente pac, Integer qtdDias) {
        internacoesRealizadas++;
        pac.setQtdDias(qtdDias);
        if (pac.isEstaInternado() == true) {
            System.out.println("Este paciente já se encontra internado");
            pac.getQtdDias();
        } else {
            pac.setEstaInternado(true);
            pac.setQtdDias(qtdDias);
            System.out.println("O paciente: " + pac.getNome() + " de idPaciente: " + pac.getIdPaciente()
                    + " está internado por " + pac.getQtdDias() + " dias");
            System.out.println("");
        }
        pac.calcularValorTotal(pac);
    }

    public void registraAlta(Paciente pac) {

        if (pac.isEstaInternado() == true) {
            pac.setEstaInternado(false);
            System.out.println("O paciente: " + pac.getNome() + " de idPaciente: " + pac.getIdPaciente()
                    + " está recebendo alta e deve pagar R$" + pac.getTotal());
            System.out.println("");
        }
        altasRealizadas++;
    }

    public void registraCirurgia(Paciente pac) {

        if (pac.isEstaInternado() == false) {

            System.out.println("Este paciente não está internado");

        } else {
            cirurgiasRealizadas++;
            pac.setFoiOperado(true);
            pac.setValorCirurgia(pac.getValorCirurgia());
            System.out.println("O paciente: " + pac.getNome() + " de idPaciente: " + pac.getIdPaciente()
                    + " foi operado e o preço da cirugia é de R$" + pac.getValorCirurgia());
            System.out.println("");
        }

    }

    public void valida(Paciente pac) {

        if (pac.isEstaInternado() == true && pac.isFoiOperado() == true) {
            resultado = "Internado e Operado";
        } else if (pac.isEstaInternado() == true) {
            resultado = "Internado";
        } else {
            resultado = "Não está internado";
        }
    }

    public void exibeStatusPaciente(Paciente pac) {
        valida(pac);
        System.out.println("ID:" + pac.getIdPaciente());
        System.out.println("Nome:" + pac.getNome());
        System.out.println("Doença:" + pac.getDoenca());
        System.out.println("Status:" + resultado);
        System.out.println("Valor da diária:" + pac.getValorDiaria());
        System.out.println("Valor da cirurgia:" + pac.getValorCirurgia());
        System.out.println("");
    }

    public void exibirRelatorio() {

        System.out.println("Internações realizadas: " + internacoesRealizadas);
        System.out.println("Cirugias realizadas: " + cirurgiasRealizadas);
        System.out.println("Altas realizadas: " + altasRealizadas);
        System.out.println("");

    }
}
