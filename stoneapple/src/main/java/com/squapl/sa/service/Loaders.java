package com.squapl.sa.service;

import com.squapl.sa.model.Users;
import com.squapl.sa.model.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;
    
    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Users.class);
        System.out.println("Loading Data");
        usersRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<Users> getData() {
        List<Users> userses = new ArrayList<>();
        userses.add(new Users("Ajay",123L, "Accounting", 12000L));
        userses.add(new Users("Jaga",1234L, "Finance", 22000L));
        userses.add(new Users("Thiru",1235L, "Accounting", 12000L));
        
        userses.forEach(user -> System.out.println((userses.iterator().hasNext())));
        
        userses.forEach(user -> System.out.println(user.getName()));
        
        
        //userses.iterator().forEachRemaining(user -> System.out.println(userses));
        
        
        //forEach(user -> {
//        	
//        });
        
        
        return userses;
    }
    

    
    
    
    
}
