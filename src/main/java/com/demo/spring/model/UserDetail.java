package com.demo.spring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable; 
@Data
@Getter
@Setter
public class UserDetail implements Serializable{


    private String name;
    private Long phone;
    
}
