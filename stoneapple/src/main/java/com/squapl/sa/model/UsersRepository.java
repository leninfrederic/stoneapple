package com.squapl.sa.model;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import org.springframework.stereotype.Repository;


public interface UsersRepository extends ElasticsearchRepository<Users, Long> {
    List<Users> findByName(String text);

    List<Users> findBySalary(Long salary);
}
