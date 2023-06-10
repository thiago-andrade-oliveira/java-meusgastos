package com.example.meusgastos.domain.model;

public class ErroResposta {

    private String dataHora;

    private String status;

    private String titulo;

    private String mensagem;

    public ErroResposta(String dataHora, String status, String titulo, String mensagem) {
        this.dataHora = dataHora;
        this.status = status;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
