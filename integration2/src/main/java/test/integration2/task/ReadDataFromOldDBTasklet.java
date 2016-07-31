package test.integration2.task;

import java.util.List;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import test.integration2.bean.City;
import test.integration2.dao.CityDao;

public class ReadDataFromOldDBTasklet implements Tasklet{
	private static final Log LOGGER = LogFactory.getLog(ReadDataFromOldDBTasklet.class);
	
	private CityDao cityDao;
	
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		LOGGER.warn("execute extract data from old db....");
		List<City> cities = cityDao.getAllCities();
		int sleep = new Random().nextInt(10000);
		LOGGER.warn("I will sleep " + sleep + " mm...");
		Thread.sleep(sleep);
		LOGGER.warn("Got " + cities.size() + " record(s).");
		return null;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}
}
