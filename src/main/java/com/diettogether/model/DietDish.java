package com.diettogether.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DietDish implements Serializable {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String description;
	
	private Set<DietCategory> categories;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the categories
	 */
	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	public Set<DietCategory> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<DietCategory> categories) {
		this.categories = categories;
	}

}
