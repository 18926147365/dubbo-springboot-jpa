/**
 * 
 */
package com.mchuan.coolact.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** 
* @author 李浩铭 
* @since 2018年5月21日 下午5:32:16
*/
@Entity
@Table(name="member")
public class Member implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name = "id")
	private Integer id;
	@Column(name="name")
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
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	
	
}
