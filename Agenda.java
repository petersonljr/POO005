package com.fatec.ads;

public class Agenda {
    // Atributos privados
    private String data;
    private String hora;
    private Consulta consulta; // Representa a Agregação/Composição do diagrama

    // Construtor sem parâmetros (Valores padrões iniciais)
    public Agenda() {
        this.data = "";
        this.hora = "";
        this.consulta = new Consulta(); // Garante que o objeto não seja nulo
    }

    // Construtor com parâmetros utilizando proteção
    public Agenda(String data, String hora, Consulta consulta) {
        try {
            if (data == null || hora == null || consulta == null) {
                throw new Exception();
            }
            this.data = data;
            this.hora = hora;
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data = "";
            this.hora = "";
            this.consulta = new Consulta();
        }
    }

    // Getters e Setters com proteção
    public String getData() {
        return data;
    }

    public void setData(String data) {
        try {
            if (data == null) throw new Exception();
            this.data = data;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valor padrão definido para data");
            this.data = "";
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        try {
            if (hora == null) throw new Exception();
            this.hora = hora;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valor padrão definido para hora");
            this.hora = "";
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        try {
            if (consulta == null) throw new Exception();
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Objeto consulta reiniciado");
            this.consulta = new Consulta();
        }
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("===== Agenda =====");
        System.out.println("Data agendada: " + data);
        System.out.println("Hora agendada: " + hora);
        if (this.consulta != null) {
            this.consulta.mostrar(); // Delega a exibição para o objeto Consulta
        }
    }

    // Método consultar conforme o diagrama
    public void consultar() {
        System.out.println("Verificando agenda para a data " + data + " às " + hora);
        if (this.consulta != null && this.consulta.getPaciente() != null) {
            System.out.println("Paciente: " + this.consulta.getPaciente().getNome());
        }
    }
}