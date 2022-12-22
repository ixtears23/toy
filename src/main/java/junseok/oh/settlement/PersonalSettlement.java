package junseok.oh.settlement;

import java.util.List;

public class PersonalSettlement implements SettlementGroup {

    private final List<PassTypeSettlement> passTypeSettlements;
    private int settlementTotal = 0;

    public PersonalSettlement(List<PassTypeSettlement> passTypeSettlements) {
        this.passTypeSettlements = passTypeSettlements;
    }

    @Override
    public void calcSettlementTotal() {
        passTypeSettlements.forEach(passTypeSettlement ->
                settlementTotal += passTypeSettlement.getTotal());
    }

    @Override
    public int getSettlementTotal() {
        return settlementTotal;
    }
}
