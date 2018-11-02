package idcard;
import framework.Product;

public class IDCard extends Product {
    private String owner;
    private int no;

    public IDCard(String owner, int no) {
        System.out.println(owner + "のカードを作成します。");
        this.owner = owner;
        this.no = no;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使いました");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getNo() {
        return no;
    }
}
