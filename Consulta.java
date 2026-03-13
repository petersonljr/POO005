package com.fatec.ads;

public class Consulta {
    // Atributos privados com tipos baseados em objetos (Associações/Composições)
    private String hora;
    private String data;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    // Construtor sem parâmetros (Composição: cria instâncias internas padrão)
    public Consulta() {
        this.hora = "";
        this.data = "";
        this.medico = new Medico(); // Inicializa objeto conforme composição
        this.paciente = new Paciente(); // Inicializa objeto conforme composição
        this.motivo = "";
        this.historico = "";
    }

    // Construtor com parâmetros protegido
    public Consulta(String hora, String data, Medico medico, Paciente paciente, String motivo, String historico) {
        try {
            if (hora == null || data == null || medico == null || paciente == null || motivo == null || historico == null) {
                throw new Exception();
            }
            this.hora = hora;
            this.data = data;
            this.medico = medico;
            this.paciente = paciente;
            this.motivo = motivo;
            this.historico = historico;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.hora = "";
            this.data = "";
            this.medico = new Medico();
            this.paciente = new Paciente();
            this.motivo = "";
            this.historico = "";
        }
    }

    // Getters e Setters com proteção contra nulos
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        try {
            if (hora == null) throw new Exception();
            this.hora = hora;
        } catch (Exception e) {
            System.out.println("Erro: Hora inválida.");
            this.hora = "";
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        try {
            if (data == null) throw new Exception();
            this.data = data;
        } catch (Exception e) {
            System.out.println("Erro: Data inválida.");
            this.data = "";
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        try {
            if (medico == null) throw new Exception();
            this.medico = medico;
        } catch (Exception e) {
            System.out.println("Erro: Médico não pode ser nulo.");
            this.medico = new Medico();
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        try {
            if (paciente == null) throw new Exception();
            this.paciente = paciente;
        } catch (Exception e) {
            System.out.println("Erro: Paciente não pode ser nulo.");
            this.paciente = new Paciente();
        }
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = (motivo == null) ? "" : motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = (historico == null) ? "" : historico;
    }

    // Método mostrar para exibir detalhes completos
    public void mostrar() {
        System.out.println("===== Detalhes da Consulta =====");
        System.out.println("Data/Hora: " + data + " às " + hora);
        System.out.println("Motivo: " + motivo);
        if (medico != null) medico.mostrar(); // Reaproveita o método mostrar de Medico
        if (paciente != null) paciente.mostrar(); // Reaproveita o método mostrar de Paciente
        System.out.println("Histórico: " + historico);
    }

    // Métodos de negócio conforme o diagrama
    public void marcar() {
        System.out.println("Consulta marcada com sucesso para o paciente: " + paciente.getNome());
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void consultar() {
        System.out.println("Realizando consulta do histórico de: " + paciente.getNome());
    }

    public void realizar() {
        System.out.println("Consulta sendo realizada pelo médico: " + medico.getNome());
    }

    public void atualizar() {
        System.out.println("Dados da consulta atualizados.");
    }
}