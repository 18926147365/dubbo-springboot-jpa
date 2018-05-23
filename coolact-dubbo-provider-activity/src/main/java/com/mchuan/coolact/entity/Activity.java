/**
 * 
 */
package com.mchuan.coolact.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 李浩铭
 * @since 2018年5月23日 下午5:35:45
 */
@Entity
@Table(name = "activity")
public class Activity implements Serializable {

	private static final long serialVersionUID = -4030454299271726076L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "name")
	private String name;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + "]";
	}

}
