package com.ra.reponsitory;

import com.ra.entity.Orderdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderdetailReponsitory extends JpaRepository<Orderdetail,Integer> {
}
