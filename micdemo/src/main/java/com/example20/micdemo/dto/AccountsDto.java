package com.example20.micdemo.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
public class AccountsDto {

    @NotEmpty
    @Pattern(regexp = "($|[0-9]{10})",message = "at least 10 numbers !")
    private Long accountNumber;
    @NotEmpty(message = "Type should not ne empty!")
    private String accountType;
    @NotEmpty(message = "Address should not ne empty!")
    private String branchAddress;
}