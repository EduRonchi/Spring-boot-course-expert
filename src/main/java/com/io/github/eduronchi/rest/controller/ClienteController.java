package com.io.github.eduronchi.rest.controller;

import com.io.github.eduronchi.domain.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    @RequestMapping(
            value = {"/api/clientes/hello/{name}", "/api/hello"},
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"}
    )

    @ResponseBody
    public Cliente helloCliente(@PathVariable("name") String nameCliente, @RequestBody Cliente cliente){
        return String.format("Hello %s ", nameCliente);
    }
}
