package com.example20.micdemo.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message =  "Name cannot be null!")
    @Size(min = 5, max = 30, message="name should be between 5 and 30 characters")
    private String name;
    @NotEmpty(message = "Email cannot be null!")
    @Email(message = "this is no email address!")
    private String email;
    @NotEmpty
    @Pattern(regexp = "($|[0-9]{10})",message = "at least 10 numbers !")
    private String mobileNumber;
    private AccountsDto accountsDto;
}

