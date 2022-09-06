package controller;




import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	@GetMapping(value="/saludo", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return"======== WELCOME TO MY SPRING BOOT ==========="; 
	}

@GetMapping(value="/contar/{cad}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String contar (@PathVariable("cad") String cad) {
		return String.valueOf(cad.length()); 
	}
}
