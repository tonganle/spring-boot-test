package com.neo.repository;

import com.neo.model.CstCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CstCustomerRepository extends JpaRepository<CstCustomer, Long> {

    CstCustomer findById(long id);
}