package com.io.github.eduronchi.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClienteController {

    @RequestMapping(value = "/api/clientes/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloCliente (@PathVariable("name") String nameCliente){
        return String.format("Hello %s ", nameCliente);

    }
}
