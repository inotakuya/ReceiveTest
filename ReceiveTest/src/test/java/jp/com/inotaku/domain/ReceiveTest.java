package jp.com.inotaku.domain;

import static org.junit.Assert.*;

import java.util.List;

import jp.com.inotaku.repository.BookRepository;
import jp.com.inotaku.service.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.json.JsonToObjectTransformer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/spring/**/*.xml")
public class ReceiveTest {

	@Autowired
	BookService bookServise;
	
	@Autowired
	private PollableChannel outChannel;
	
	
	
	@Test
	public void test() {
		Message<Book> message = (Message<Book>)outChannel.receive(2000);
		
		System.out.println(message);
	}

}
