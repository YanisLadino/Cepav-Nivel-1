package com.cepav.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoCruelControler {
	
	@RequestMapping("/saludo")
	
	public String quebonitosaludarysersaludado() {
		return "Hola Gente, saber hacer un hola mundo en Java no te convierte en un experto en programacion.";
	}
}
