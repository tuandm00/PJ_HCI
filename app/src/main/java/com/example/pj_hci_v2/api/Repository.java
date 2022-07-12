package com.example.pj_hci_v2.api;

import com.example.pj_hci_v2.service.AccountService;
import com.example.pj_hci_v2.service.ItemService;

public class Repository {
  public static ItemService getItemService(){
      return APIClient.getClient().create(ItemService.class);
  }
}
