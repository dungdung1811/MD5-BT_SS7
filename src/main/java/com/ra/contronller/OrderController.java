package com.ra.contronller;

import com.ra.dto.request.OrderRequest;
import com.ra.dto.response.OrderResponse;
import com.ra.entity.Orders;
import com.ra.service.OrderService;
import com.ra.ulti.exception.UserExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/{idUser}")
    public ResponseEntity<Orders> addNewOrderByUserId(@PathVariable Integer idUser, @RequestBody OrderRequest orderRequest) throws UserExeption {
        return  new ResponseEntity<>(orderService.addNewOrderByUserId(idUser,orderRequest),HttpStatus.CREATED);
    }
    @GetMapping
    ResponseEntity<List<OrderResponse>> getAllOrder(){
        return  new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

}
