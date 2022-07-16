package factorydesignpattern;

  class Araba implements Tasit{
    @Override
    public String tasit (String content) {
        return "Araba" + content;
    }
}
