package com.example.demo.service;

import com.example.demo.VO.Book;
import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.entity.Subscription;
import com.example.demo.repository.SubscriptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository SubscriptionRepository;

	
	  @Autowired 
	  private RestTemplate restTemplate;
	 

    public Subscription saveSubscription(Subscription Subscription) {
       // log.info("Inside saveSubscription of SubscriptionService");
        return SubscriptionRepository.save(Subscription);
    }

	
	  public ResponseTemplateVO getSubscriptionWithBook(Long bookId)
	  { 
		  //log.info("Inside getSubscriptionWithDepartment of SubscriptionService");
		  ResponseTemplateVO vo = new ResponseTemplateVO(); 
	  Subscription Subscription = SubscriptionRepository.findByBookId(bookId);
	  
	  Book book = restTemplate.getForObject("http://BOOK-SERVICE/books/" +Subscription.getBookId() ,Book.class);
	  
	  vo.setScubscription(Subscription); 
	  vo.setBooks(book);	  
	  return vo;
	  }
	 
}
