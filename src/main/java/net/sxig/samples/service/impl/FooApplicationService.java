package net.sxig.samples.service.impl;

import java.util.ArrayList;
import java.util.List;


import net.sxig.samples.model.FooEntity;
import net.sxig.samples.service.ApplicationService;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
@Service
public class FooApplicationService implements ApplicationService<FooEntity>{
	static Logger log = Logger.getLogger(FooApplicationService.class);

	@Override
	public List<FooEntity> generateData() {
		
		StopWatch watch = null;
		if (log.isTraceEnabled()) {
			watch = new StopWatch();
			watch.start("generate-foo-data");
			log.trace("Generating Data");
		}
		List<FooEntity> fooList = new ArrayList<FooEntity>();
		for (int i = 0; i < 100; i++) {
			fooList.add(new FooEntity("axei" +i , "fooString_" + i));

		}

		if (log.isTraceEnabled()) {
			watch.stop();
			log.trace("Data generation completed in: "
					+ watch.getLastTaskTimeMillis() + " ms");

		}
		log.debug("datasize => " + fooList.size());
		return fooList;
	}
	
	
}
