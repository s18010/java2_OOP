package idcard;
import framework.Factory;
import framework.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class IDCardFactory extends Factory {
    // private List<String> owners = new ArrayList<String>();
    private Map<Integer, String> owners = new HashMap<>();
    private Integer lastNo = 0;

    @Override
    protected Product createProduct(String owner) {
        lastNo++;
        return new IDCard(owner, lastNo);
    }

    @Override
    protected void registerProduct(Product product) {
         owners.put(((IDCard)product).getNo(), ((IDCard)product).getOwner());
    }

    public Map<Integer, String> getOwners() {
        return owners;
    }
}
