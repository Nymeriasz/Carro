package carro;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private Motor motor;
    private Pessoa proprietario;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = 2024;
        this.motor = new Motor();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Motor getMotor() {
        return motor;
    }

    public void alteraPotencia(double valor) {
        motor.setPotencia(valor);
    }

    public void acelerador(){
        System.out.println("Carro acelerado!");
    }
}
