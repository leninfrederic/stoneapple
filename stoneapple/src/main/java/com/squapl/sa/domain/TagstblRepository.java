package com.squapl.sa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagstblRepository extends JpaRepository<Tagstbl,Long> {

}
