package com.team1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.team1.domain.Music;
import com.team1.mapper.MusicMapper;
import com.team1.service.MusicService;

@Controller
public class MusicController {

	@Autowired
	private MusicService service;
	
	@Autowired
	private MusicMapper mapper;
	
	@GetMapping("/music/music")
	public String music(Model model) throws Exception {
		
		List<Music> musicList = service.list();
		
		model.addAttribute("musicList", musicList);
		
		return "/music/music";
	}
	
//	@GetMapping("/music/genre/{genre}")
//	public String getMusicByGenre(@PathVariable("genre") String genre, Model model) {
//	    // 매퍼를 호출하여 genre에 해당하는 데이터를 추출
//	    List<Music> musicList = mapper.selectMusicByGenre(genre);
//	    model.addAttribute("musiclist", musicList);
//	    return "music";
//	}
	
	// 수정해보자
//	@GetMapping("/music/genre/{genre}")
//	public String getMusicByGenre(@PathVariable("genre") String genre, Model model) {
//	    List<Music> musicList = mapper.selectMusicByGenre(genre);
//	    model.addAttribute("musicList", musicList);
//	    return "music/musicByGenre";
//	}

    
	@GetMapping("/music/genre/{genre}")
	public String getMusicByGenre(@PathVariable("genre") String genre, Model model) {
	    List<Music> musicList = mapper.selectMusicByGenre(genre);
	    model.addAttribute("musicList", musicList);
	    return "music/musicByGenre :: musicByGenreContainer";
	}
    
}
