package net.sxig.samples.repo;

import net.sxig.samples.model.FooEntity;


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
public interface FooEntityRepository extends JpaRepository<FooEntity, Long>{

}
