package com.mackenzie.daggermvp.login;

public class MemoryRepo implements LoginRepo {

    private User user;
    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }

    @Override
    public User getUser() {
        if (user == null) {
            user = new User("Antoñico", "El Mosca");
            user.setId(0);
            return user;
        } else {
            return  user;
        }
    }
}
