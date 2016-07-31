package test.integration2;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
//        context.registerShutdownHook();
//        CityDao cityDao = context.getBean("cityDao", CityDao.class);
//        List<City> cities = cityDao.getAllCities();
//        System.out.println(cities.size());
//        
//        JobLauncher jobLauncher = context.getBean("jobLauncher", JobLauncher.class);
//        Job job = context.getBean("cpDataToNewDBJob", Job.class);
//        try {
//            JobExecution execution = jobLauncher.run(job, new JobParameters());
//            System.out.println("Exit Status : " + execution.getStatus());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Done");
    }
}
