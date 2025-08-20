package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.DslistApplication;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")

public class GameController {

    private final DslistApplication dslistApplication;
	
	@Autowired
	private GameService gameService;

    GameController(DslistApplication dslistApplication) {
        this.dslistApplication = dslistApplication;
    }
	
    @GetMapping
	public List<GameMinDTO>findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
			
	
}
