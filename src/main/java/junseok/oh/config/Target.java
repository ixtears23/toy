package junseok.oh.config;

import java.util.List;

public class Target {
    private String type;
    private List<PassType> passTypes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<PassType> getPassTypes() {
        return passTypes;
    }

    public void setPassTypes(List<PassType> passTypes) {
        this.passTypes = passTypes;
    }
}
