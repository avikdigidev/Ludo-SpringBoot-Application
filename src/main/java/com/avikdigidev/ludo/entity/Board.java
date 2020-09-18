package com.avikdigidev.ludo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Board {
	private int boardId;

	private List<Integer> safezones;
	private List<Integer> lastSteps;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Team> totalPlayers;
}
