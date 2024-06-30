package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService{
        
    AccountRepository repository = new AccountRepository();

    public CheckingService(AccountRepository repository) {
        this.repository = repository;
    }

    public void createAccount(Checking account) {
        this.repository.createAccount(account);
    }

    public Checking retrieveAccount(String id) {
        return (Checking)this.repository.retrieveAccount(id);
    }

    public void updateAccount(Checking account) {
        this.repository.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().add(amount));
        updateAccount(checking);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking checking = retrieveAccount(id);
        checking.setBalance(checking.getBalance().subtract(amount));
        updateAccount(checking);
    }

}
