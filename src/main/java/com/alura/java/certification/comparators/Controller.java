package com.alura.java.certification.comparators;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @autor Adriano Rabello 27/01/2021  4:54 PM
 */

@RestController
@RequestMapping(value = "/foo")
@CrossOrigin("*")
public class Controller {

    @PostMapping
    public void handleFoo(HttpServletResponse response) throws IOException {
        System.out.println("dentro ");
        response.sendRedirect("http://portal.cb.es.gov.br/seguranca-cbmes/loginToken");
    }
}
