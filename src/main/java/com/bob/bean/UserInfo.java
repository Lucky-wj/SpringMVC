package com.bob.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * userinfo
 * @author 
 */
@Data
public class UserInfo implements Serializable {
    private Long id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}