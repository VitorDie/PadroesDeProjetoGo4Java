package padroesDeCriacao.singleton;

public class Singleton {
    private static Singleton intance = null;

    protected Singleton() {

    }
    public static Singleton getInstance() {
        if (intance == null) {
            intance = new Singleton();
        }

        return intance;
    }
}
