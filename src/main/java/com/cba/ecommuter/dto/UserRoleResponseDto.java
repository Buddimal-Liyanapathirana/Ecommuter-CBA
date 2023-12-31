package com.cba.ecommuter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRoleResponseDto implements java.io.Serializable {

    private Integer id;
    private Integer userId;
    private Integer roleId;
    private String status;

    private static final long serialVersionUID = 1L;

}
