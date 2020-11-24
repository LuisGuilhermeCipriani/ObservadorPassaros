package br.ufjf.dcc196.luisguilhermecipriani.observador;

public class Avistamento {
    private String nome;
    private String especie;
    private Integer avistamentos;

    public Avistamento(String nome, String especie, Integer avistamentos) {
        this.nome = nome;
        this.especie = especie;
        this.avistamentos = avistamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getAvistamentos() {
        return avistamentos;
    }

    public void setAvistamentos(Integer avistamentos) {
        this.avistamentos = avistamentos;
    }
}
