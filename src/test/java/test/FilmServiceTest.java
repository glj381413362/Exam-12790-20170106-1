package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.impl.FilmServiceImpl;

public class FilmServiceTest {
	private ConfigurableApplicationContext application;
	private FilmServiceImpl filmService;

	@Before
	public void setUp() throws Exception {
		application = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext-*.xml");
		filmService = (FilmServiceImpl) application.getBean("filmService");
	}

	@Test
	public void testDeleteByPrimaryKeyService() {
		int res = filmService.deleteByPrimaryKeyService((short)130);
		System.out.println(res);
	}

}
