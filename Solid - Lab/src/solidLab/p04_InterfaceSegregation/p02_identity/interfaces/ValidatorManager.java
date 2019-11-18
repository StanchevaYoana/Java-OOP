package solidLab.p04_InterfaceSegregation.p02_identity.interfaces;

import solidLab.p04_InterfaceSegregation.p02_identity.interfaces.interfaces.Validation;

public class ValidatorManager implements Validation {
    private boolean isUniqueEmail;
    private int minPasswordLength;
    private int maxPasswordLength;

    @Override
    public boolean getRequireUniqueEmail() {
        return this.isUniqueEmail;
    }

    @Override
    public int getMinRequiredPasswordLength() {
        return this.minPasswordLength;
    }

    @Override
    public int getMaxRequiredPasswordLength() {
        return this.maxPasswordLength;
    }
}
