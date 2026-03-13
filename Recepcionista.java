package com.fatec.ads;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.senha = "";
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        // ... (mantenha seu construtor com try-catch igual ao original)
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    // --- MÉTODOS QUE ESTAVAM FALTANDO ---

    public void cadastrarPaciente(Paciente p) {
        System.out.println("Recepcionista " + this.nome + " cadastrou o paciente: " + p.getNome());
    }

    public void agendarConsulta(Paciente p, Consulta c) {
        c.setPaciente(p);
        System.out.println("Consulta agendada com sucesso para " + p.getNome());
    }

    public String getNome() { return nome; }
    // ... (mantenha os demais getters e setters originais)
}