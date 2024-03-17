package DeCriacao;

import org.junit.Test;
import padroesDeCriacao.abstractFactory.mundoInteligivel.AbstractFactory;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductA;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductB;
import padroesDeCriacao.abstractFactory.mundoSensivel.ConcreteFactory1;
import padroesDeCriacao.abstractFactory.mundoSensivel.ConcreteFactory2;

public class AbstractFactoryTest {
    @Test
    public void fabrica1Test() {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA pa = factory.createProductA();
        AbstractProductB pb = factory.createProductB();
    }

    public void fabrica2Test() {
        AbstractFactory factory = new ConcreteFactory2();
        AbstractProductA pa = factory.createProductA();
        AbstractProductB pb = factory.createProductB();
    }
}
