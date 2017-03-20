INSERT INTO article (idarticle, art_title_en, art_title_rl, createdby, published_timestamp) 
  SELECT '1','article heading ','article heading rl',1,NULL FROM DUAL
WHERE NOT EXISTS 
  (SELECT idarticle FROM article WHERE idarticle='1');
