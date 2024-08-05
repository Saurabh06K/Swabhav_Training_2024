package com.Aurionpro.Creaational.AbstractFactory.Model;

public interface IAccountFactory {
    IAccount createAccount(String name, String accountNumber, double amount);
}

