package padroesDeCriacao.abstractFactory.mundoSensivel;

import padroesDeCriacao.abstractFactory.mundoInteligivel.AbstractFactory;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductA;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductB;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductA1;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
