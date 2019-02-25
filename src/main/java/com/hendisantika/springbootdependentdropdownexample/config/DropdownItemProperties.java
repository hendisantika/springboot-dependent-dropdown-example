package com.hendisantika.springbootdependentdropdownexample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.SortedMap;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dependent-dropdown-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-25
 * Time: 16:50
 */
@Configuration
@PropertySource("classpath:dropdownValues.properties")
@ConfigurationProperties(prefix = "dropdown-value")
public class DropdownItemProperties {
    private SortedMap<String, String> userRoleOptions;

    public SortedMap<String, String> getUserRoleOptions() {
        return userRoleOptions;
    }

    public void setUserRoleOptions(SortedMap<String, String> userRoleOptions) {
        this.userRoleOptions = userRoleOptions;
    }

}