package com.GamingBlog.gamingblog.repository;

import com.GamingBlog.gamingblog.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
