package net.sxig.samples.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.apache.log4j.Logger;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * 
 * This Entity will generate the following MySQL Queryies:
 *     
 *     create table BarEntity (
        id bigint not null,
        secIdString varchar(255) not null,
        barString varchar(255),
        primary key (id, secIdString)
    ) ENGINE=InnoDB
        
        -- This will store the next available identity.
        create table BarEntityIds (
         tablename varchar(255) not null ,
         id bigint,
        primary key ( tablename ) 
    ) 
 */
@Entity
@IdClass(BarEntityPk.class)
public class BarEntity {
	static Logger log = Logger.getLogger(BarEntity.class);
	@Id
	protected String barString;
	
	
	//Id re-definition as required by the @idClass annotation above.
	//ID specificiations will be found in the embeddable class BarEntityPk
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

	

	/**
	 * @return the barString
	 */
	public String getBarString() {
		return barString;
	}

	/**
	 * @param barString the barString to set
	 */
	public void setBarString(String barString) {
		this.barString = barString;
	}

	

	public BarEntity(String barString, String secIdString) {
		super();
		this.barString = barString;
		this.secIdString = secIdString;
	}

	public BarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("BarEntity [barString=%s, id=%s, secIdString=%s]",
				barString, id, secIdString);
	}
	
}
