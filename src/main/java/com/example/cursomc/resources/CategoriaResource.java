package com.example.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
//Aqui em cima vai o nome do endpoint que quero usar.
//Padrão: usar nome do conceito no plural - categoria + s
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Leo!asdasdasd";
	}
}
