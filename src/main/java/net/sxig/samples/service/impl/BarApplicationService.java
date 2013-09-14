package net.sxig.samples.service.impl;

import java.util.ArrayList;
import java.util.List;

import net.sxig.samples.model.BarEntity;
import net.sxig.samples.model.BarEntityPk;
import net.sxig.samples.service.ApplicationService;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Service
public class BarApplicationService implements ApplicationService<BarEntity> {
	static Logger log = Logger.getLogger(BarApplicationService.class);

	@Override
	public List<BarEntity> generateData() {
		StopWatch watch = null;
		if (log.isTraceEnabled()) {
			watch = new StopWatch();
			watch.start("generate-data");
			log.trace("Generating Data");
		}
		List<BarEntity> barList = new ArrayList<BarEntity>();
		for (int i = 0; i < 100; i++) {
			barList.add(new BarEntity("ABCD-"+RandomUtils.nextInt(), "BarString_" + i));

		}

		if (log.isTraceEnabled()) {
			watch.stop();
			log.trace("Data generation completed in: "
					+ watch.getLastTaskTimeMillis() + " ms");

		}
		log.debug("datasize => " + barList.size());
		return barList;
	}
}
