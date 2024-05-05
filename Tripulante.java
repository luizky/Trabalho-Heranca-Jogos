package br.unipar.jogo;

public class Tripulante {

    private Cores cores;
    private Desafios desafios;
    private Acessorios acessorios;
    private Movimento movimento;
    private Procedimentos procedimentos;

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public Desafios getDesafios() {
        return desafios;
    }

    public void setDesafios(Desafios desafios) {
        this.desafios = desafios;
    }

    public Acessorios getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Acessorios acessorios) {
        this.acessorios = acessorios;
    }

    public Movimento getMovimento() {
        return movimento;
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    public Procedimentos getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(Procedimentos procedimentos) {
        this.procedimentos = procedimentos;
    }
}
