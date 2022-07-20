package model;

public class Subtracao implements Operacao {
    public int numero1;
    public int numero2;

    @Override
    public double calcula(){
        return numero1 - numero2;
    }

    @Override
    public String toString() {
        return "A subtração de " + numero1 + " e " + numero2 + " é " + calcula();
    }

}
