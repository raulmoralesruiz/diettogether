package com.diettogether.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DietRegister implements Serializable {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Double weight;

	private LocalDate weightDate;

	private LocalDate nextDateRegister;

	private Double weightDifference;

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
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * @return the weightDate
	 */
	public LocalDate getWeightDate() {
		return weightDate;
	}

	/**
	 * @param weightDate the weightDate to set
	 */
	public void setWeightDate(LocalDate weightDate) {
		this.weightDate = weightDate;
	}

	/**
	 * @return the nextDateRegister
	 */
	public LocalDate getNextDateRegister() {
		return nextDateRegister;
	}

	/**
	 * @param nextDateRegister the nextDateRegister to set
	 */
	public void setNextDateRegister(LocalDate nextDateRegister) {
		this.nextDateRegister = nextDateRegister;
	}

	/**
	 * @return the weightDifference
	 */
	public Double getWeightDifference() {
		return weightDifference;
	}

	/**
	 * @param weightDifference the weightDifference to set
	 */
	public void setWeightDifference(Double weightDifference) {
		this.weightDifference = weightDifference;
	}

}
