package com.LesAmisDeLEscalade.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LesAmisDeLEscalade.entities.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site,Long> {

}
