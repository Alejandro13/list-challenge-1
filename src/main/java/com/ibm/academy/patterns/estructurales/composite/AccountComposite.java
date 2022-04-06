package com.ibm.academy.patterns.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

//Funcion de agregacion en el uml
public class AccountComposite implements AccountComponent{

    //Le paso la interfaz como un tipo de dato
    private List<AccountComponent> childAccount;

    public AccountComposite(){
        this.childAccount = new ArrayList<>();
    }


    @Override
    public void showAccountName() {
        for(AccountComponent account: this.childAccount){
            account.showAccountName();
        }
    }

    @Override
    public double getAmount() {
        Double totalAmount = 0.0;
        for( AccountComponent account : this.childAccount){
            totalAmount += account.getAmount();
        }
        System.out.println("La cantidad acumulada es:   " + totalAmount);
        return totalAmount;
    }

    //Para agregar una cuenta
    public void addAccount(AccountComponent currentAccount) {
        this.childAccount.add(currentAccount);
    }

    //Para remover una cuenta
    public void removeAccount(AccountComponent currentAccount) {
        this.childAccount.remove(currentAccount);
    }
}
