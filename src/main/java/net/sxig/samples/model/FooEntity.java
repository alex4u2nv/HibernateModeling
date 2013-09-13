package net.sxig.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.log4j.Logger;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Entity
public class FooEntity {
	static Logger log = Logger.getLogger(FooEntity.class);
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	private String fooString;


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
	 * @return the fooString
	 */
	public String getFooString() {
		return fooString;
	}


	/**
	 * @param fooString the fooString to set
	 */
	public void setFooString(String fooString) {
		this.fooString = fooString;
	}


	public FooEntity(Long id, String fooString) {
		super();
		this.id = id;
		this.fooString = fooString;
	}


	public FooEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
