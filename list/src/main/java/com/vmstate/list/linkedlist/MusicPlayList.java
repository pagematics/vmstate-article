package com.vmstate.list.linkedlist;

import java.util.LinkedList;

public class MusicPlayList 
{
    private LinkedList<String> playlist;
    
    public MusicPlayList() 
    {
        this.playlist = new LinkedList<String>();
    }
    
    //Add a new song to the play list
    public void addSong(String song) 
    {
        playlist.addLast(song); 
    }
    
    //Remove a song from the playlist
    public void removeSong(int index) 
    {
        if (index >= 0 && index < playlist.size()) 
        {
            playlist.remove(index);
        }
    }
    
    //Move a song to a different index
    public void moveSong(int from, int to) 
    {
        if (from >= 0 && from < playlist.size() && to >= 0 && to < playlist.size()) 
        {
            String song = playlist.remove(from); 
            playlist.add(to, song); 
        }
    }
    
    //Print the music play list
    public void printPlaylist() 
    {
        for (String song : playlist) 
        {
            System.out.println(song);
        }
    }
    
    //Creating an instance of the class MusicPlayList with four songs
    public static void main(String[] args) 
    {
        MusicPlayList musicPlaylist = new MusicPlayList();
        musicPlaylist.addSong("Flowers");
        musicPlaylist.addSong("Calm Down");
        musicPlaylist.addSong("Search and Rescue");
        musicPlaylist.addSong("Double Fantacy");
        System.out.println("Initial play list");
        musicPlaylist.printPlaylist();
        musicPlaylist.moveSong(3, 1); 
        musicPlaylist.removeSong(2); 
        System.out.println("Play list after removing and rearranging the songs");
        musicPlaylist.printPlaylist();
    }
}

