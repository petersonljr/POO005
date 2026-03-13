package com.fatec.ads;

public class Exame {
    // Atributos privados
    private Consulta consulta;
    private String data;
    private String descritivo;

    // Construtor sem parâmetros
    public Exame() {
        this.consulta = new Consulta();
        this.data = "";
        this.descritivo = "";
    }

    // Construtor com parâmetros
    public Exame(Consulta consulta, String data, String descritivo) {
        try {
            if (consulta == null || data == null || descritivo == null) {
                throw new Exception();
            }
            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.consulta = new Consulta();
            this.data = "";
            this.descritivo = "";
        }
    }

    // Getters e Setters
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        try {
            if (consulta == null) throw new Exception();
            this.consulta = consulta;
        } catch (Exception e) {
            this.consulta = new Consulta();
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = (data == null) ? "" : data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = (descritivo == null) ? "" : descritivo;
    }

    public void mostrar() {
        System.out.println("===== EXAME SOLICITADO =====");
        System.out.println("Data: " + data);
        System.out.println("Exame: " + descritivo);
        if (consulta != null && consulta.getMedico() != null) {
            System.out.println("Solicitado pelo Dr(a): " + consulta.getMedico().getNome());
        }
    }

    public void solicitar() {
        System.out.println("Solicitando exame: " + descritivo);
    }

    public void consultar() {
        System.out.println("Consultando resultado do exame...");
    }
}