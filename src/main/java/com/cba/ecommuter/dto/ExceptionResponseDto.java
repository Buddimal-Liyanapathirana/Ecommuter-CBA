package com.cba.ecommuter.dto;

import java.time.LocalDateTime;

/**
 * this is immutable
 * all args constructor,getters,setters,hashcode,equals,toString
 */
public record ExceptionResponseDto(LocalDateTime timestamp,
                                   String message,
                                   String details) {

}
