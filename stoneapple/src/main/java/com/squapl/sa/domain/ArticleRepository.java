package com.squapl.sa.domain;

import com.squapl.sa.domain.Article;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Long> {

	@Query("SELECT t.art_title_en FROM Article t where t.idarticle = :id")
	Article findbyTitle(@Param("id") Long id);

}
