package cl.duoc.integracionsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.integracionsvc.service.InstrumentoService;

@RestController
@RequestMapping("/instrumento-svc")
public class InstrumentoController {
    
    @Autowired
    InstrumentoService instrumentoService;
    @GetMapping(path = "/saludo", produces = "application/json")
    public String saludo(){
        return instrumentoService.otroSaludo();
    }
}
