package net.sxig.samples.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

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
@Embeddable
public class BarEntityPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9147359290466087925L;
	static Logger log = Logger.getLogger(BarEntityPk.class);
	//Because Hibernate doesn't support composite strategies, this must be configured in DB
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator="fooIdenity")
	@TableGenerator(name="fooIdenity", table="BarEntityIds",
	pkColumnName="tablename", // TableID.TableName (value = table_name, test_table, etc.)
	valueColumnName="id", // TableID.ID (value = 1,2,3,etc.)
	allocationSize=1 // flush every 1 insert
)	
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

	public BarEntityPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BarEntityPk(Long id, String secIdString) {
		super();
		this.id = id;
		this.secIdString = secIdString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("BarEntityPk [id=%s, secIdString=%s]", id,
				secIdString);
	}
	
}
