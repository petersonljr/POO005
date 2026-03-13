package com.fatec.ads;

public class Paciente {
    // Atributos privados
    private int codigo;
    private String nome;
    private String email;

    // Construtor sem parâmetros
    public Paciente() {
        this.codigo = 0;
        this.nome = "";
        this.email = "";
    }

    // Construtor com parâmetros protegido
    public Paciente(int codigo, String nome, String email) {
        try {
            // Validando Strings nulas
            if (nome == null || email == null) {
                throw new Exception();
            }
            this.codigo = codigo;
            this.nome = nome;
            this.email = email;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.codigo = 0;
            this.nome = "";
            this.email = "";
        }
    }

    // Getters e Setters com proteção
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        try {
            // Exemplo de proteção: código não pode ser negativo
            if (codigo < 0) throw new Exception();
            this.codigo = codigo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.codigo = 0;
        }
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            if (email == null) throw new Exception();
            this.email = email;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.email = "";
        }
    }

    // Método mostrar
    public void mostrar() {
        System.out.println(">>>>> Paciente <<<<<");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    @Override
    public String toString() {
        return "Paciente [Código=" + codigo + ", Nome=" + nome + ", Email=" + email + "]";
    }
}