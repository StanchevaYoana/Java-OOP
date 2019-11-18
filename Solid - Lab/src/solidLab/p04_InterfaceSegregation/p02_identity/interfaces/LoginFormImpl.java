package solidLab.p04_InterfaceSegregation.p02_identity.interfaces;

import solidLab.p04_InterfaceSegregation.p02_identity.interfaces.interfaces.LoginForm;

public class LoginFormImpl implements LoginForm {

    private String name;
    private String password;
    private String email;


    @Override
    public void login(String username, String password) {
    }

    @Override
    public void register(String username, String password,String email) {
    }

    @Override
    public void changePassword(String oldPass, String newPass) {
    }
}
