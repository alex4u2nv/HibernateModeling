package net.sxig.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("MooEntity [id=%s, mooString=%s, barEntity=%s]",
				id, mooString, barEntity);
	}
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
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
