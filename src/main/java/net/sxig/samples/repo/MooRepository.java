package net.sxig.samples.repo;

import java.util.List;

import net.sxig.samples.model.BarEntity;
import net.sxig.samples.model.MooEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Repository
public interface MooRepository extends JpaRepository<MooEntity, Long>{

	//Since JpaRepository findByBarEntity(BarEntity) does not work.
	//We will write the jpa query here.
	@Query("select moo from MooEntity moo where moo.barEntity =:bar")
	@Transactional(readOnly=true)
	MooEntity fetchByBarEntity(@Param("bar") BarEntity barEntity);
	
}
