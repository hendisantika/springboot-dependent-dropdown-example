package com.hendisantika.springbootdependentdropdownexample.controller;

import com.hendisantika.springbootdependentdropdownexample.config.DropdownItemProperties;
import com.hendisantika.springbootdependentdropdownexample.config.RadioButtonProperties;
import com.hendisantika.springbootdependentdropdownexample.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-dependent-dropdown-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-25
 * Time: 16:54
 */
@Controller
public class UserController {

    private static Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private DropdownItemProperties dropdownItemProperties;

    @Autowired
    private RadioButtonProperties radioButtonItemProperties;

    @RequestMapping("/")
    public String displayExample(User user, Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/save", params = {"save"}, method = RequestMethod.POST)
    public String saveUser(@Valid User user, BindingResult bindingResult,
                           Model model) {
        logger.info(user.toString());
        return "redirect:/";
    }

    @ModelAttribute("userRoleOptions")
    public Map<String, String> getUserRoleOptions() {
        return dropdownItemProperties.getUserRoleOptions();
    }

    @ModelAttribute("statusOptions")
    public Map<String, String> getStatusOptions() {
        return radioButtonItemProperties.getStatusOptions();
    }
}

