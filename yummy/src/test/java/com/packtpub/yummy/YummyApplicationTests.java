package com.packtpub.yummy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YummyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	DatePrinter datePrinter;

	@MockBean
	TimeFactory timeFactory;

	@Test
	public void datePrinterWorks(){
		given(timeFactory.now()).willReturn(LocalDateTime.of(2019, 2, 4, 14, 29, 25 ));
		assertEquals("Now is 2019-02-04T14:29:25", datePrinter.printDate());
	}

}

