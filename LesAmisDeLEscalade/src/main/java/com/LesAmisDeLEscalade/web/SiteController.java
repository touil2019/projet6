package com.LesAmisDeLEscalade.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LesAmisDeLEscalade.dao.SiteRepository;
import com.LesAmisDeLEscalade.entities.Site;

@Controller
public class SiteController {
	@Autowired
	private SiteRepository siteRepository;
	
	@RequestMapping(value="/site")
	public String site(Model model) {
		List<Site> site=siteRepository.findAll();
		model.addAttribute("listSite",site);
		return "site";
	}
}
