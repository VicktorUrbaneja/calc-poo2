package model;

public class Adicao implements Operacao{
    public int numero1;
    public int numero2;

    @Override
    public double calcula(){
        return numero1 + numero2;
    }

    @Override
    public String toString() {
        return "A soma de " + numero1 + " e " + numero2 + " é " + calcula();
    }

}
