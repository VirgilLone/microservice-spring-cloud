package com.lw.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


public class MicroserviceSimpleProviderUserApplicationTests {

	@Test
	public void contextLoads() {

		List<People> perList = new ArrayList();

		People person = new People();
		for (int i = 0; i < 5; i++) {
			//设置属性
			person.setId(i + 1);
			person.setName("Lin");
			person.setAge(10);
			//添加到List中
			perList.add(person);
		}
		for (People p: perList) {
			System.out.println(p.getId()+p.getName()+p.getAge());
		}
	}


}
