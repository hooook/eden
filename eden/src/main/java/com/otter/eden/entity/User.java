package com.otter.eden.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6196300990471660695L;
    private Integer id;
    private String name;
}
