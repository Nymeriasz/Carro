package carro;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pamela",20);
        Carro c1 = new Carro("onix","chevrolet");
        c1.setProprietario(p1);
        System.out.println(p1.getNome());
        System.out.println(c1.getModelo());
        System.out.println("Proprietário: "+c1.getProprietario().getNome());
        System.out.println("Potência: "+c1.getMotor().getPotencia());
        c1.alteraPotencia(4.0);
        System.out.println("Potência: "+c1.getMotor().getPotencia());
        p1.setCarro(c1);
        System.out.println("O carro de "+p1.getNome()+ " é: "+p1.getCarro().getModelo());
        p1.acelera();
    }
}
