package factorydesignpattern;

public class TasitFactory {

    public static Tasit getInstance(TasitType tasitType) {
        switch (tasitType) {
            case ARABA:
                return new Araba();
            case BİSİKLET:
                return new Bisiklet();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum TasitType {
        ARABA,
        BİSİKLET;
    }
}