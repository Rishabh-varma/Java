public class javatut15oops {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.username = "rishabh";
        // acc.password="5141";
        acc.setpass("5143");
        Pen obj =new Pen ();
        obj.setcolor("blue");
        // System.out.println(obj.color);
        System.out.println(obj.getColor());
        obj.settip(5);
        // System.out.println(obj.tip);
        System.out.println(obj.gettip());



    }

}

class BankAccount {
    public String username;
    private String password;

    public void setpass(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}
