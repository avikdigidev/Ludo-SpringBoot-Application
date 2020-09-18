package com.avikdigidev.ludo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "player")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	// @GeneratedValue generates the value for the column of database table. In case
	// of GenerationType. IDENTITY , value is set by table itself that should be
	// unique.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private int playerId;
	@Column(name = "position")
	private int position;
	@Column(name = "playerStatus")
	private boolean playerStatus;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JsonIgnore
	@JoinColumn(name = "team_color_id")
	private Team team;

}
