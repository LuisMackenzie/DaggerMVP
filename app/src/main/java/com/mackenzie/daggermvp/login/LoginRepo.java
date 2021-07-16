package com.mackenzie.daggermvp.login;

public interface LoginRepo {

    public abstract void saveUser(User user);
    public abstract User getUser();
}
