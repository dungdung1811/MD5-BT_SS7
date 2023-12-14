package com.ra.dto.request;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ra.entity.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private String phone;
    private String Address;
    private String comment;
    private Boolean status;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date orderDate;
}
