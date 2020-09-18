package com.avikdigidev.ludo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "team")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_color_id")
	private Integer teamColorId;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Player> players;
	@Column(name = "move")
	private Integer move;
	@Column(name = "last_move")
	private List<Integer> lastMove;
	@Column(name = "score_points")
	private Long scorePoints;

}
