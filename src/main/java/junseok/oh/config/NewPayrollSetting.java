package junseok.oh.config;

import java.util.List;

public class NewPayrollSetting {
    private String moneyType;
    private List<Target> targets;

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }
}
