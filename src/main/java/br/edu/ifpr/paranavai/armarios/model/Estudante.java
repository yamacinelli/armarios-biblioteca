package br.edu.ifpr.paranavai.armarios.model;

public class Estudante extends Pessoa{
    private String ra;
    
    public Estudante(){
        super("Yago", "12306612300", "yago@gmail.com", "44991119471", "senha", true, null, null);
        this.ra = "1234567890";
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
}
