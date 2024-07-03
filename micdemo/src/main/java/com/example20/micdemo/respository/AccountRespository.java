package com.example20.micdemo.respository;

import com.example20.micdemo.entity.Accounts;
import com.example20.micdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountRespository extends JpaRepository<Accounts, Long> {

Optional<Accounts> findByCustomerId(Long customerId);

@Transactional
@Modifying
void deleteByCustomerId(Long customerId);
}
