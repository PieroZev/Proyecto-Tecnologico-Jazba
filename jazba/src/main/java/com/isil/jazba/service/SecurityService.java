package com.isil.jazba.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}
