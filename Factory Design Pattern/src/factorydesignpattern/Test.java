package factorydesignpattern;

public class Test {
    public static void main(String[] args) {

        String tasit = TasitFactory.getInstance(TasitFactory.TasitType.ARABA)
                .tasit(" Test Edildi.");
        System.out.println(tasit);

        String tasit1 = TasitFactory.getInstance(TasitFactory.TasitType.BİSİKLET)
                .tasit(" Test Edildi.");
        System.out.println(tasit1);


    }
}
