package net.sxig.samples.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;
@Embeddable
public class BarEntityPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9147359290466087925L;
	static Logger log = Logger.getLogger(BarEntityPk.class);
	@GeneratedValue
	Long id;
	
	String secIdString;

	/**
	 * @return the id
	 */
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
	 * @return the secIdString
	 */
	public String getSecIdString() {
		return secIdString;
	}

	/**
	 * @param secIdString the secIdString to set
	 */
	public void setSecIdString(String secIdString) {
		this.secIdString = secIdString;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
}
