package com.neo.repository;

import com.neo.model.CstCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CstLinkmanRepository extends JpaRepository<CstCustomer, Long> {
}