package com.LesAmisDeLEscalade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.LesAmisDeLEscalade.dao.SiteRepository;
import com.LesAmisDeLEscalade.entities.Site;

@SpringBootApplication
public class LesAmisDeLEscaladeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(LesAmisDeLEscaladeApplication.class, args);
	SiteRepository siteRepository=ctx.getBean(SiteRepository.class);
	siteRepository.save(new Site("le pic de dante","Guyane","Maripasoula"));
	siteRepository.save(new Site("le pic vert", "Réunion", "Bois de Nèfles"));
	siteRepository.save(new Site("le pic rouge", "Mayotte", "Mamoudzou"));}

}
