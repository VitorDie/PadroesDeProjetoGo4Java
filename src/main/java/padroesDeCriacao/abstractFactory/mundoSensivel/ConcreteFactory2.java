package padroesDeCriacao.abstractFactory.mundoSensivel;

import padroesDeCriacao.abstractFactory.mundoInteligivel.AbstractFactory;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductA;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductB;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductA2;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
