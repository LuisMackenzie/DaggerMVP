package com.mackenzie.daggermvp.login;

public class LoginActivityModel implements LoginActivityMVP.Model {

    private LoginRepo repo;

    public LoginActivityModel(LoginRepo repo) {
        this.repo = repo;
    }

    @Override
    public void createUser(String firstName, String lastName) {
        // Logica de negocio aqui
        repo.saveUser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        // Logica de negocio aqui
        return repo.getUser();
    }
}
