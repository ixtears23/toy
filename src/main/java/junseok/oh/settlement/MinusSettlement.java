package junseok.oh.settlement;

import junseok.oh.config.NewPayrollSetting;

import java.util.List;

public class MinusSettlement implements Settlement<Refund> {
    private final NewPayrollSetting newPayrollSetting;
    private final List<Refund> refunds;

    private int totalAmount = 0;

    public MinusSettlement(NewPayrollSetting newPayrollSetting, List<Refund> refunds) {
        this.newPayrollSetting = newPayrollSetting;
        this.refunds = refunds;
    }

    @Override
    public void calcTotal() {

    }

    @Override
    public int getTotal() {
        return 0;
    }

    @Override
    public List<Refund> getOrders() {
        final String moneyType = newPayrollSetting.getMoneyType();

        return null;
    }
}
