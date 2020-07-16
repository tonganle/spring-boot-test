package com.neo.service;

import com.neo.model.CstCustomer;
import com.neo.repository.CstCustomerRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service
public class CstCustomerServiceImpl implements  CstCustomerService{

    @Resource
    private CstCustomerRepository cstCustomerRepository;

    @Override
    public  CstCustomer findById(long custId){
        return cstCustomerRepository.findById(custId);
    }

}
