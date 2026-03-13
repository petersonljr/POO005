package com.fatec.ads;

public class Medico {
    // Atributos privados
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    // Construtor sem parâmetros
    public Medico() {
        this.nome = "";
        this.crm = "";
        this.telefone = "";
        this.especialidade = "";
        this.senha = "";
    }

    // Construtor com parâmetros protegido
    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        try {
            if (nome == null || crm == null || telefone == null || especialidade == null || senha == null) {
                throw new Exception();
            }
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "";
            this.crm = "";
            this.telefone = "";
            this.especialidade = "";
            this.senha = "";
        }
    }

    // Getters e Setters com proteção
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            if (nome == null) throw new Exception();
            this.nome = nome;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "";
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        try {
            if (crm == null) throw new Exception();
            this.crm = crm;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.crm = "";
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        try {
            if (telefone == null) throw new Exception();
            this.telefone = telefone;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.telefone = "";
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        try {
            if (especialidade == null) throw new Exception();
            this.especialidade = especialidade;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.especialidade = "";
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        try {
            if (senha == null) throw new Exception();
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.senha = "";
        }
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Senha: " + senha);
    }

    // Método acessar
    public void acessar() {
        System.out.println("Médico " + nome + " acessou o sistema.");
    }

    @Override
    public String toString() {
        return "Medico [Nome=" + nome + ", CRM=" + crm + ", Especialidade=" + especialidade + "]";
    }
}