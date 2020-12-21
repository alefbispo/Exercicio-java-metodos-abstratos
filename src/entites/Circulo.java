package entites;

import aplication.enums.Cor;

public class Circulo extends Forma {
    private Double raio;

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
