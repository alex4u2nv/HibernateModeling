package net.sxig.samples;

import java.util.Iterator;
import java.util.List;

import net.sxig.samples.model.BarEntity;
import net.sxig.samples.model.FooEntity;
import net.sxig.samples.repo.BarEntityJpa;
import net.sxig.samples.repo.FooEntityRepository;
import net.sxig.samples.service.ApplicationService;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class GeneralTest {
	static Logger log = Logger.getLogger(GeneralTest.class);
	@Autowired
	BarEntityJpa barEntityJpa;

	@Autowired
	FooEntityRepository fooEntityRepository;

	@Autowired
	ApplicationService<BarEntity> barApplicationService;
	@Autowired
	ApplicationService<FooEntity> fooApplicationService;

	// This test does nothing; it's used as a quick ramp up test to load DB.
	@Test
	public void nothing() {

	}
	/**
	 * Pass a list of objects to be saved, and verify that their auto generated IDs are 
	 * being generated.
	 * @throws Exception
	 */
	@Test
	public void insertBarData() throws Exception {
		log.trace("Testing data insertion");
		List<BarEntity> barList = barApplicationService.generateData();
		log.debug("datasize => " + barList.size());
		barList = barEntityJpa.save(barList);
		for (BarEntity barEntity : barList) {
			Assert.assertNotNull(barEntity);
			Assert.assertNotNull(barEntity.getId());
			log.debug(barEntity);
			
		}

	}

	/**
	 * Pass a list of objects to be saved, and verify that their auto generated IDs are 
	 * being generated.
	 * @throws Exception
	 */
	@Test
	public void insertFooData() throws Exception {
		log.trace("Testing Foo Data insertion");
		List<FooEntity> fooList = fooApplicationService.generateData();
		log.debug("datasize => " + fooList.size());
		Assert.assertNotNull(fooList);
		Assert.assertTrue(fooList.size()>0);
		fooEntityRepository.save(fooList);
		
			for (FooEntity fooEntity : fooList) {
				Assert.assertNotNull(fooEntity);
				Assert.assertNotNull(fooEntity.getIdLong());
				log.debug(fooEntity);
			}

	}

}
