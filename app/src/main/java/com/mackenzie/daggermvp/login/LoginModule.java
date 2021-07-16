package com.mackenzie.daggermvp.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model) {
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepo repo) {
        return new LoginActivityModel(repo);
    }

    @Provides
    public LoginRepo provideLoginRepo() {
        return new MemoryRepo();
    }

}
