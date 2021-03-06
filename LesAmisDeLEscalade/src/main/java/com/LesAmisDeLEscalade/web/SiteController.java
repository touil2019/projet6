package com.LesAmisDeLEscalade.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LesAmisDeLEscalade.dao.SiteRepository;
import com.LesAmisDeLEscalade.entities.Site;

@Controller
public class SiteController {
	@Autowired
	private SiteRepository siteRepository;
	
	@RequestMapping(value="/site")
	public String site(Model model) {
		List<Site> listSite=siteRepository.findAll();
		model.addAttribute("listSite", listSite);
		return "site";		
		}
	@GetMapping(value="/site/{id}/supprimer")
	public String supprimerSite(Model model , @PathVariable(value="id")Long id) {
		
		siteRepository.deleteById(id);
		return "redirect:/site";
	}
}
