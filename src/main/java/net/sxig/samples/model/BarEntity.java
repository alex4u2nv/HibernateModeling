package net.sxig.samples.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class BarEntity {
	static Logger log = Logger.getLogger(BarEntity.class);
	@Id
	//Because Hibernate doesn't support composite strategies, this must be configured in DB
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Embedded
	protected BarEntityPk bepkIdBarEntityPk;
	
	protected String barString;

	/**
	 * @return the bepkIdBarEntityPk
	 */
	public BarEntityPk getBepkIdBarEntityPk() {
		return bepkIdBarEntityPk;
	}

	/**
	 * @param bepkIdBarEntityPk the bepkIdBarEntityPk to set
	 */
	public void setBepkIdBarEntityPk(BarEntityPk bepkIdBarEntityPk) {
		this.bepkIdBarEntityPk = bepkIdBarEntityPk;
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
	
}
