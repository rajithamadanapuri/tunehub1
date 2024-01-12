package com.example.demo.SpringApplication.services;

import java.util.List;

import com.example.demo.SpringApplication.entities.Playlist;

public interface PlayListService {
	
	public void addPlaylist(Playlist playlist);
	public List<Playlist> fetchAllPlaylists();
	
}
