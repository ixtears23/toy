package junseok.oh.settlement;

import java.util.List;

public class AppointmentPassTypeSettlement implements PassTypeSettlement {

    private final List<Settlement<Order>> settlements;
    private int totalAmount = 0;

    public AppointmentPassTypeSettlement(List<Settlement<Order>> settlements) {
        this.settlements = settlements;
    }

    @Override
    public void calcTotal() {
        settlements.forEach(Settlement::calcTotal);
        settlements.forEach(orderSettlement ->
                totalAmount += orderSettlement.getTotal());
    }

    @Override
    public int getTotal() {
        return totalAmount;
    }
}
