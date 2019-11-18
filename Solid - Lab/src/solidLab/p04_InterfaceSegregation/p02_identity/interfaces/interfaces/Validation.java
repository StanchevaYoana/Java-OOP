package solidLab.p04_InterfaceSegregation.p02_identity.interfaces.interfaces;

public interface Validation {
    boolean getRequireUniqueEmail();

    int getMinRequiredPasswordLength();

    int getMaxRequiredPasswordLength();
}
