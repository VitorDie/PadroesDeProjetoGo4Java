package padroesDeCriacao.abstractFactory.mundoInteligivel;

import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductA;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductB;

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
