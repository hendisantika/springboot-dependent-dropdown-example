package com.hendisantika.springbootdependentdropdownexample.config;

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
 * Time: 16:51
 */
@Configuration
@PropertySource("classpath:dropdownValues.properties")
public class RadioButtonProperties {
    private SortedMap<String, String> statusOptions;

    public SortedMap<String, String> getStatusOptions() {
        return statusOptions;
    }

    public void setStatusOptions(SortedMap<String, String> statusOptions) {
        this.statusOptions = statusOptions;
    }

}