package com.adp.entiy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	private Integer id;
	private String name;
	private String director;
	private String producer;
	@JsonIgnore
	private Integer actorId;

}
