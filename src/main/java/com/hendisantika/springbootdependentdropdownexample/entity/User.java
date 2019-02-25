package com.hendisantika.springbootdependentdropdownexample.entity;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dependent-dropdown-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-25
 * Time: 16:49
 */

@Data
public class User {
    private Long id;
    private String userName;
    private String fullName;
    private String userRole;
    private String status;
}
