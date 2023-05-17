public class GettersAndSetters {
    public static void main(String[] args) {

        Pen pn = new Pen();
        
        pn.setColor("blue");
        System.out.println(pn.getColor());

        pn.setTip(5);
        System.out.println(pn.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
