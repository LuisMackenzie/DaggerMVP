package com.mackenzie.daggermvp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mackenzie.daggermvp.databinding.ActivityLoginBinding;
import com.mackenzie.daggermvp.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.Presenter presenter;

    private ActivityLoginBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ((App) getApplication()).getComponent().inject(this);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButton();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return binding.etEmail.getText().toString();
    }

    @Override
    public String getLastName() {
        return binding.etPass.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "El usuario no esta disponible", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        binding.etEmail.setError("El nombre y apellido son requeridos");
    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this, "El usuario se guardo bien", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFistName(String firstName) {
        binding.etEmail.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        binding.etPass.setText(lastName);
    }
}