package net.sxig.samples.repo;

import net.sxig.samples.model.BarEntity;
import net.sxig.samples.model.BarEntityPk;

import org.apache.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Repository
public interface BarEntityJpa extends JpaRepository<BarEntity, BarEntityPk>{

	
}
