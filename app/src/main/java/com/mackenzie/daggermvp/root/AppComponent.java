package com.mackenzie.daggermvp.root;

import com.mackenzie.daggermvp.login.LoginActivity;
import com.mackenzie.daggermvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(LoginActivity target);

}
