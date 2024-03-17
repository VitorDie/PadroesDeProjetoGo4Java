package DeCriacao;

import org.junit.Assert;
import org.junit.Test;
import padroesDeCriacao.abstractFactory.mundoInteligivel.AbstractFactory;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductA;
import padroesDeCriacao.abstractFactory.mundoInteligivel.products.AbstractProductB;
import padroesDeCriacao.abstractFactory.mundoSensivel.ConcreteFactory1;
import padroesDeCriacao.abstractFactory.mundoSensivel.ConcreteFactory2;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductA1;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductA2;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductB1;
import padroesDeCriacao.abstractFactory.mundoSensivel.products.ProductB2;

public class AbstractFactoryTest {
    @Test
    public void fabrica1Test() {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA pa = factory.createProductA();
        AbstractProductB pb = factory.createProductB();

        Assert.assertTrue(pa instanceof ProductA1);
        Assert.assertTrue(pb instanceof ProductB1);
    }

    @Test
    public void fabrica2Test() {
        AbstractFactory factory = new ConcreteFactory2();
        AbstractProductA pa = factory.createProductA();
        AbstractProductB pb = factory.createProductB();

        Assert.assertTrue(pa instanceof ProductA2);
        Assert.assertTrue(pb instanceof ProductB2);
    }
}
