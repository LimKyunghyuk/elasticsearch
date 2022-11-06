package org.devlion.elasticsearch;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElasticsearchApplicationTests {

	@Resource
	PhoneRepository blogEsRepository;
	
	@Test
	void test() {
		Phone blog = new Phone();
		
		
	    blog.setId("2");
	    blog.setContent("내용입니다.");
	    blog.setTitle("제목입니다.");
	    blogEsRepository.save(blog);
		
	}

}
