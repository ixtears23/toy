package junseok.oh.settlement;

import java.util.List;

public interface OrderPassRepository {
    List<Order> findNewOrderPass();
    List<Order> findReOrderPass();
}
