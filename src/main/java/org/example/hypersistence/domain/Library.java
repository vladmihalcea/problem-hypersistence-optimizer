package org.example.hypersistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "library")
public class Library {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
}
