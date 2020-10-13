package kr.co.jhta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobApp {

	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		
		JobDao jobDao = ctx.getBean(JobDao.class);
		
		Job job = jobDao.getJobById("����");
		System.out.println(job.getId());
		System.out.println(job.getTitle());
		System.out.println(job.getMinSalary());
		System.out.println(job.getMaxSalary());
		
		
		
		/*
		 * Job job = new Job(); job.setId("����"); job.setTitle("����������");
		 * job.setMinSalary(2000); job.setMaxSalary(6000);
		 * 
		 * jobDao.insertJob(job);
		 */
		
	}
}