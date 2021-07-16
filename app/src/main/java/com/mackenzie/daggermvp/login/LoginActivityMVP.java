package com.mackenzie.daggermvp.login;

public interface LoginActivityMVP {

    interface View {
        public abstract String getFirstName();
        public abstract String getLastName();

        public abstract void showUserNotAvailable();
        public abstract void showInputError();
        public abstract void showUserSaved();

        public abstract void setFistName(String firstName);
        public abstract void setLastName(String lastName);

    }

    interface Presenter {

        public abstract void setView(LoginActivityMVP.View view);

        public abstract void loginButton();

        public abstract void getCurrentUser();
    }

    interface Model{
        public abstract void createUser(String firstName,String lastName);

        public abstract User getUser();
    }

}
