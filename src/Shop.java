import com.jcp.Cart;
import com.jcp.Shopper;

public class Shop {

	public static void main(String[] args) {
		Cart c = new Cart();
		Shopper s = new Shopper(c);
		s.addShirt("red", "wave", 2345);
		s.addPant(40, 4900, "cotton");
	}

}
