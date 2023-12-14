package com.ra.service.impl;

import com.ra.dto.request.OrderRequest;
import com.ra.dto.response.OrderResponse;
import com.ra.entity.Orders;
import com.ra.entity.User;
import com.ra.reponsitory.OrderRepository;
import com.ra.reponsitory.UserRepository;
import com.ra.service.OrderService;
import com.ra.ulti.exception.UserExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderSeviceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<OrderResponse> findAll() {
        return orderRepository.findAll().stream().map(item->OrderResponse.builder()
                .oderId(item.getOderId())
                .orderDate(item.getOrderDate())
                .name(item.getUser().getUserName())
                .email(item.getUser().getEmail())
                .phone(item.getPhone())
                .Address(item.getAddress())
                .comment(item.getComment())
                .status(item.getStatus())
                .build()).toList();
    }

    @Override
    public Orders findById(Integer id) {
        return null;
    }

    @Override
    public Orders save(Orders orders) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Orders addNewOrderByUserId(Integer idUser, OrderRequest orderRequest) throws UserExeption {
        Optional<User> optionalUser = userRepository.findById(idUser);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            Orders orders = Orders.builder()
                    .orderDate(orderRequest.getOrderDate())
                    .name(user.getUserName())
                    .email(user.getEmail())
                    .phone(orderRequest.getPhone())
                    .Address(orderRequest.getAddress())
                    .comment(orderRequest.getComment())
                    .status(false)
                    .user(user)
                    .build();
            return  orderRepository.save(orders);
        }
        throw new UserExeption("uer không tồn tại");
    }
}
