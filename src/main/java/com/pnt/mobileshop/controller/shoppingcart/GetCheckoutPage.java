package com.pnt.mobileshop.controller.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetCheckoutPage {

    @GetMapping("/checkoutPage")
    public String getCheckoutPage(){
        return "checkout";
    }

}
