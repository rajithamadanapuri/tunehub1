package com.example.demo.SpringApplication.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.SpringApplication.entities.Song;
import com.example.demo.SpringApplication.repositories.SongRepositoty;

@Service
public class SongServiceImplementation implements SongService{

	
	
	@Autowired
	SongRepositoty repo;
	
	@Override
	public void addSong(Song song) {
		 repo.save(song);
	}

	@Override
	public List<Song> fetchAllSongs() {
		return repo.findAll();
		
	}

	@Override
	public boolean songExists(String name) {
		Song song=repo.findByName(name);
		if(song== null)
		{
			return false;
		}
		else
		{
			return true;
			
		}
		
	}

	@Override
	public void updateSong(Song song) {
		repo.save(song);
		
	}
     
}
