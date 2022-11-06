package org.devlion.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends ElasticsearchRepository<Phone, Integer>{
	
    
}
