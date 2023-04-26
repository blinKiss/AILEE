package com.team1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.team1.domain.Music;

@Mapper
public interface MusicMapper {

	public List<Music> list() throws Exception;
	
	public List<Music> selectMusicByGenre(String genre);

}
