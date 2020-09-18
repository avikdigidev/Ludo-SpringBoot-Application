package com.avikdigidev.ludo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avikdigidev.ludo.service.LudoService;


@RestController
public class LudoController {
	


	public static final Logger LOGGER = LoggerFactory.getLogger(LudoController.class);
	@Autowired
	LudoService ludoService;


	@GetMapping(value = "/playerStatus")
	public void getPlayerStatus() {

		ludoService.getPlayerStatus();

	}


	
	//controller
//	+ StartGame()
//	+ playerStatus()
//	+ EndGame()
//	+ InitializeBoard()
//	+ RollDie()
//	+ DisableDie()
//	+ UpdateView()
	//Team
//	+ CanMovePiece()
//	+ EndGame()
//	+ MovePiece()
//	+ NextPlayerTurn()
//	+ RollDie()
//	+ StartGame()
//	+ UpdatePlayer()
//	//Player
//	SetPieceStatus()
//	+ SetPieceNumber()
//	+ GetPieceNumber()
//	+ SetColor
//	+ SetWon()
//	//board
//	+ SetColor()
//	+ SetWon()
//	+ GetColor()
//	+GetWon()
	
	
}
