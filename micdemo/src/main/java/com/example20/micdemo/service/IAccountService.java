package com.example20.micdemo.service;

import com.example20.micdemo.dto.AccountsDto;
import com.example20.micdemo.dto.CustomerDto;
import com.example20.micdemo.entity.Customer;
import org.springframework.data.repository.query.Param;

public interface IAccountService {

     void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);

}
