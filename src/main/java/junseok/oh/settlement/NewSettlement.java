package junseok.oh.settlement;

import junseok.oh.config.NewPayrollSetting;

import java.util.List;

public class NewSettlement implements Settlement<Order> {

    private final NewPayrollSetting newPayrollSetting;
    private final OrderPassRepository orderPassRepository;
    private int totalAmount = 0;

    public NewSettlement(NewPayrollSetting newPayrollSetting, OrderPassRepository orderPassRepository) {
        this.newPayrollSetting = newPayrollSetting;
        this.orderPassRepository = orderPassRepository;
    }

    @Override
    public void calcTotal() {
        getOrders().forEach(
                order -> totalAmount += order.getSaleAmount()
        );
    }

    @Override
    public int getTotal() {
        return totalAmount;
    }

    @Override
    public List<Order> getOrders() {
        return orderPassRepository.findNewOrderPass();
    }
}
