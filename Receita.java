package com.fatec.ads;

public class Receita {
    // Atributos privados
    private Consulta consulta; // Associação/Composição com o objeto Consulta
    private String data;
    private String descritivo;

    // Construtor sem parâmetros
    public Receita() {
        this.consulta = new Consulta();
        this.data = "";
        this.descritivo = "";
    }

    // Construtor com parâmetros protegido
    public Receita(Consulta consulta, String data, String descritivo) {
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

    // Getters e Setters com proteção
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        try {
            if (consulta == null) throw new Exception();
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Erro: Objeto consulta inválido.");
            this.consulta = new Consulta();
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
            this.data = "";
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = (descritivo == null) ? "" : descritivo;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("===== RECEITA MÉDICA =====");
        System.out.println("Data da Receita: " + data);
        System.out.println("Descrição: " + descritivo);
        if (consulta != null) {
            System.out.println("Referente à consulta de: " + consulta.getData());
        }
    }

    public void preescrever() {
        System.out.println("Receita prescrita: " + descritivo + " na data " + data);
    }

    public void consultar() {
        System.out.println("Consultando detalhes da receita...");
    }
}