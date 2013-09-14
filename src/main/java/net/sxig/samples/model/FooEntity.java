package net.sxig.samples.model;

import java.io.Serializable;

import javax.persistence.Entity;
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
@Entity
public class FooEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4363984099607196158L;
	static Logger log = Logger.getLogger(FooEntity.class);
	private String idString;
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator="fooIdenity")
	@TableGenerator(name="fooIdenity", table="TableID",
	pkColumnName="tablename", // TableID.TableName (value = table_name, test_table, etc.)
	valueColumnName="id", // TableID.ID (value = 1,2,3,etc.)
	allocationSize=1 // flush every 1 insert
)
	private Long idLong;

	private String fooString;

	public FooEntity(Long idLong, String idString, String fooString) {
		super();
		this.idLong = idLong;
		this.idString = idString;
		this.fooString = fooString;
	}


	/**
	 * @return the idLong
	 */
	public Long getIdLong() {
		return idLong;
	}


	/**
	 * @param idLong the idLong to set
	 */
	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}


	/**
	 * @return the idString
	 */
	public String getIdString() {
		return idString;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"FooEntity [idLong=%s, idString=%s, fooString=%s]", idLong,
				idString, fooString);
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

	public FooEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FooEntity(String fooString) {
		super();
		this.fooString = fooString;
	}

	/**
	 * @param idString the idString to set
	 */
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public FooEntity(String idString, String fooString) {
		super();
		this.idString = idString;
		this.fooString = fooString;
	}

}
