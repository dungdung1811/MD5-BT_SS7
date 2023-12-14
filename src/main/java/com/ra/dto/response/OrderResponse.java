package com.ra.dto.response;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ra.entity.Orderdetail;
import com.ra.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Integer oderId;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date orderDate;
    private String name;
    private String email;
    private String phone;
    private String Address;
    private String comment;
    private Boolean status;
   private  String userName;
}
