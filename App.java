package com.fatec.ads;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("--- INICIANDO TESTES DO SISTEMA ---");

        // Criando a base
        Paciente p1 = new Paciente(1, "Jose da Silva", "jose@norton.net.br");
        Medico m1 = new Medico("Dr. Arnaldo", "CRM-123", "11-999", "Cardio", "123");
        Recepcionista r1 = new Recepcionista("Ana", "111", "222", "senha");

        // Criando a Consulta (Composição conforme o diagrama)
        Consulta consulta1 = new Consulta("14:00", "15/03/2026", m1, p1, "Checkup", "Nenhum");

        // Criando documentos que dependem da consulta
        Receita receita1 = new Receita(consulta1, "15/03/2026", "Vitamina C");
        Exame exame1 = new Exame(consulta1, "15/03/2026", "Hemograma");

        // --- SEÇÃO DE TESTES (IGUAL À SUA IMAGEM) ---
        
        System.out.println("\n>>> TESTE DE METODOS DE NEGOCIO DA CONSULTA:");
        consulta1.marcar();
        consulta1.realizar();

        System.out.println("\n>>> TESTE DE DOCUMENTOS MÉDICOS:");
        receita1.mostrar();
        exame1.mostrar();

        System.out.println("\n>>> TESTE DE AÇÕES DA RECEPCIONISTA:");
        r1.cadastrarPaciente(p1);
        r1.agendarConsulta(p1, consulta1);

        // Teste de Proteção
        System.out.println("\n>>> TESTE DE PROTEÇÃO (SETTER NULO):");
        Exame exameErro = new Exame();
        exameErro.setConsulta(null); // Isso deve acionar o catch da sua classe Exame

        System.out.println("\n--- FIM DOS TESTES ---");
    }
}