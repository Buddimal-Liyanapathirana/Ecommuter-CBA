package com.cba.ecommuter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PermissionRequestDto implements Serializable {

    private Integer roleId;
    private Integer resourceId;
    private Integer readd;
    private Integer created;
    private Integer updated;
    private Integer deleted;

    private static final long serialVersionUID = 1L;

}
