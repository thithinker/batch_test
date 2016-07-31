package test.integration2.task;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import test.integration2.bean.City;
import test.integration2.dao.CityDao;

public class ReadDataFromNewDBTasklet implements Tasklet{
	private static final Log LOGGER = LogFactory.getLog(ReadDataFromNewDBTasklet.class);
	
	private CityDao cityDao;
	
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		System.out.println("execute extract data from new db....");
		LOGGER.warn("execute extract data from new db....");
		List<City> cities = cityDao.getAllCities();
		LOGGER.warn("Got " + cities.size() + " record(s).");
		System.out.println("Got " + cities.size() + " record(s).");
		return null;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}
}
