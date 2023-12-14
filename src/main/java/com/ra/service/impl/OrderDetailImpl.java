package com.ra.service.impl;

import com.ra.reponsitory.OrderdetailReponsitory;
import com.ra.service.OrderDetaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailImpl implements OrderDetaiService {
    @Autowired
    private OrderdetailReponsitory orderdetailReponsitory;
}
