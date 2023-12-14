package com.ra.service;

import com.ra.dto.request.OrderRequest;
import com.ra.dto.response.OrderResponse;
import com.ra.entity.Orders;
import com.ra.ulti.exception.UserExeption;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface OrderService {
    List<OrderResponse> findAll();
    Orders findById(Integer id);
    Orders save(Orders orders);
    void delete(Integer id);
   Orders addNewOrderByUserId(Integer id, OrderRequest orderRequest) throws UserExeption;
}
