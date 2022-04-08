package com.example.demo.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Daikichi")
public class ControladorDaikichi {
	
	        @RequestMapping("")
	        public String hola() {
	                return "Bienvenido";
	        }
	        @RequestMapping("/today")
	        public String today() {
	                return "El dia de hoy tendras un viaje lleno de bugs, pero no te olvides, aplica la regla de los 20 minutos";
	        }
	        @RequestMapping("/tomorrow")
	        public String tomorrow() {
	                return "EL dia de mañana tendras mas problemas encontrando tu vuelo que programador codificando en java, tu numero de la suerte es el 5";
	        }
	        @RequestMapping("/travel/{ciudad}")
	        public String happicity(@PathVariable("ciudad") String city) {
	                return "<h1>Felicitaciones! ¡Pronto viajarás a "+city+"!</h1>";
	        }
	        @RequestMapping("/lotto/{numero}")
	        public String suertedeloto(@PathVariable("numero") int numerodelasuerte) {
	            if (numerodelasuerte % 2 == 0) {
	            	return "<h1>Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras</h1>";
	            }
	            else {
	            	return "<h1>Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos</h1>";
	            }
	        }
	        
	        
	}
