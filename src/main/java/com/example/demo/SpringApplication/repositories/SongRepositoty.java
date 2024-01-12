package com.example.demo.SpringApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.SpringApplication.entities.Song;

public interface SongRepositoty extends JpaRepository<Song, Integer>{
	public Song findByName(String name);

}
