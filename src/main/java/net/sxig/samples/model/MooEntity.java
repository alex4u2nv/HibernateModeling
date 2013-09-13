package net.sxig.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

import org.apache.log4j.Logger;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Entity
public class MooEntity {
	static Logger log = Logger.getLogger(MooEntity.class);
	@Id
	@GeneratedValue
	private Long id;
	private String mooString;
	
	@OneToOne
	@JoinColumns({
		@JoinColumn(name="barId"),
		@JoinColumn(name="barSecIdString")
	})
	private BarEntity barEntity;
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
	 * @return the mooString
	 */
	public String getMooString() {
		return mooString;
	}
	/**
	 * @param mooString the mooString to set
	 */
	public void setMooString(String mooString) {
		this.mooString = mooString;
	}
	public MooEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MooEntity(Long id, String mooString) {
		super();
		this.id = id;
		this.mooString = mooString;
	}
	
}
