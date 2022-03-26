package Calc;

public class Calc {
    
    private double base, height, length;
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCalc() {
        if (this.base == 0 || this.height == 0 || this.length == 0) {
            return 0;
        } else {
            return this.base * this.height * this.length;
        }
    }
}

//Você trabalha como analista/programador em uma fábrica de software e foi encarregado de criar uma aplicação que calcule o volume de concreto para o trabalho com vigas em construção civil. Sabe-se que a fórmula para o cálculo deste volume é (base x altura x comprimento).