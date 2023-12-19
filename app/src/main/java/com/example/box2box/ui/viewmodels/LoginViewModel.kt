package com.example.box2box.ui.viewmodels

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private var _user = MutableLiveData("")
    val user: LiveData<String> = _user

    private var _password = MutableLiveData("")
    val password: LiveData<String> = _password

    private var _passwordVisible = MutableLiveData(false)
    val passwordVisible: LiveData<Boolean> = _passwordVisible

    fun setUser(user : String) {
        _user.value = user
    }

    fun setPassword(password : String) {
        _password.value = password
    }

    fun setPasswordVisible(passwordVisible : Boolean) {
        _passwordVisible.value = passwordVisible
    }

    fun isEmailValid(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(_user.value).matches()
    }

    fun isPasswordValid(): Boolean {
        val password = _password.value
        if (password != null) {
            return password.any { it.isDigit() } && password.any { it.isLetter() } && password.length > 6
        }
        return false
    }

    /*

    fun imageVector() = if (_passwordVisible.value == true) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
    fun description() = if (_passwordVisible.value == true) "Hide password" else "Show password"
    fun visualTransformation() = if (_passwordVisible.value == true) VisualTransformation.None else PasswordVisualTransformation()

     */


}