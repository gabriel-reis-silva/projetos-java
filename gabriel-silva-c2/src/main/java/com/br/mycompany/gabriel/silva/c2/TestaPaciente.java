/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mycompany.gabriel.silva.c2;

/**
 *
 * @author gabriel reis
 */
public class TestaPaciente {

    public static void main(String[] args) {
        Paciente maria = new Paciente();
        Paciente mario = new Paciente();
// Configuração dos valores
        maria.setIdPaciente(1000);
        maria.setNome("Maria da Silva");
        maria.setDoenca("Diabetes");
        maria.setEstaInternado(true);
        maria.setFoiOperado(true);
        maria.setValorCirurgia(0.00);
        maria.setValorDiaria(100.00);

        mario.setIdPaciente(2000);
        mario.setNome("Mario Luigi Yoshi");
        mario.setDoenca("Tuberculose");
        mario.setEstaInternado(false);
        mario.setFoiOperado(false);
        mario.setValorCirurgia(2.0);
        mario.setValorDiaria(100.00);
// Configuração dos valores

// Objeto do tipo hospital
        Hospital h1 = new Hospital();
// Objeto do tipo hospital

        h1.registraInternacao(maria, 2);


        h1.registraInternacao(mario, 4);


        h1.exibeStatusPaciente(maria);


        h1.exibeStatusPaciente(mario);


        h1.registraCirurgia(mario);


        h1.registraAlta(maria);


        h1.exibeStatusPaciente(maria);


        h1.exibeStatusPaciente(mario);


        h1.exibirRelatorio();


        h1.registraAlta(mario);

    }

}
