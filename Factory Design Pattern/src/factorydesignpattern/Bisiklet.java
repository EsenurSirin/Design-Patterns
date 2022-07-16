package factorydesignpattern;

class Bisiklet implements Tasit {

    @Override
    public String tasit(String content) {
        return "Bisiklet" + content;
    }
}
