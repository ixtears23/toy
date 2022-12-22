package junseok.oh.settlement;

import java.util.List;

public interface Settlement<T> {
    void calcTotal();
    int getTotal();
    List<T> getOrders();
}
