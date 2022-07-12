package com.example.pj_hci_v2.api;

import com.example.pj_hci_v2.service.AccountService;

public class AccountRepository {
    public static AccountService getAccountService(){
        return APIClient.getClient().create(AccountService.class);
    }
}
