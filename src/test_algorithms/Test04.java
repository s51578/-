package test_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Song implements Comparable<Song>{
	private int songNum;
	private String genre;
	private int play;
	
	
	public int getSongNum() {
		return songNum;
	}
	public void setSongNum(int songNum) {
		this.songNum = songNum;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPlay() {
		return play;
	}
	public void setPlay(int play) {
		this.play = play;
	}
	
	public int compareTo(Song s) {
		if(this.play<s.play) {
			return 1;
		}else if(this.play>s.play) {
			return -1;
		}else {
			return 0;
		}
	}
	
}



class Genre implements Comparable<Genre>{
	String genre;
	//List<Song> songs;
	int allPlay;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAllPlay() {
		return allPlay;
	}
	public void setAllPlay(int allPlay) {
		this.allPlay += allPlay;
	}
//	public List<Song> getSongs() {
//		return songs;
//	}
//	public void setSongs(List<Song> songs) {
//		this.songs = songs;
//	}
	
	@Override
	public int compareTo(Genre g) {
		if(this.allPlay<g.allPlay) {
			return 1;
		}else if(this.allPlay>g.allPlay) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class Test04 {
	
	
	public static int[] solution(String[] genres, int[] plays) {
        
		
//        
//        HashMap<String, Integer> total = new HashMap<String, Integer>();
//        
//        for(int i =0 ; i<genres.length; i++) {
//        	
//        	total.put(genres[i], total.getOrDefault(genres[i], 0)+plays[i]);
//        	
//        }
//        System.out.println(total);
//        List<String> genreList = new ArrayList<String>(total.keySet());
//        
//        genreList.sort((o1,o2)-> total.get(o2)-total.get(o1));
//        
//        List<Integer> finalList = new ArrayList<Integer>();
//        for(int i=0; i<genreList.size(); i++) {
//        	List<Song> list = new ArrayList<Song>();
//        	
//        	Song song = new Song();
//        	song.setGenre("pop");
//        	song.setPlay(i);
//        	song.setSongNum(1);
//        	
//        	list.add(song);
//        	
//        	
//        	
//        	
//        	
//        	System.out.println(song.getGenre()+song.getPlay());
//        	
//        	
//        	String compare = genreList.get(i);
//        	//new list = 500 150 800;
//        	//[0] [1]
//        			
//        			
//        			
//        	int max = 0;
//        	int firstValue = -1;
//        	
//        	for(int j=0; j<genres.length; j++) {
//        		
//        		if(compare.equals(genres[j]) && max<plays[j]) {
//        			
//        			max = plays[j];
//        			firstValue = j;
//        			
//        			
//        		}	
//        	}
//        	max = 0;
//        	int secondValue = -1;
//        	for(int j=0; j<genres.length; j++) {
//        		
//            	
//        		if(compare.equals(genres[j]) && max<plays[j] && j != firstValue) {
//        			
//        			max = plays[j];
//        			secondValue = j;
//        		}
//        	}
//        	
//        	finalList.add(firstValue);
//        	
//        	if(secondValue>=0)
//        	finalList.add(secondValue);
//        	
//        	
//        	
//        }
//        
//       int[] answer = new int[finalList.size()];
//       for(int i=0; i< finalList.size(); i++) {
//    	   answer[i] = finalList.get(i);
//    	   
//    	  
//       }
		List<Song> list = new ArrayList<>();
		
		
		
		
        for(int i=0; i<genres.length; i++) {
        	
        	
        	Song song = new Song();
        	
        	song.setGenre(genres[i]);
        	song.setPlay(plays[i]);
        	
        	song.setSongNum(i);
        	
        	list.add(song);
        	
        	
        }
        Collections.sort(list);
        List<Genre> totalList = new ArrayList<Genre>();
//        for(int i=0; i<genres.length; i++) {
//        	
//        	if(totalList.isEmpty()) {
//        		Genre g = new Genre();
//        		int sum = 0;
//        		sum += plays[i];
//        		
//        		g.setGenre(genres[i]);
//        		g.setAllPlay(sum);
//        		g.setAllPlay(sum);
//        		
//        		totalList.add(g);
//        		
//        	}

        
        
       
        HashMap<String, Integer> total = new HashMap<String, Integer>();
      
      for(int i =0 ; i<genres.length; i++) {
      	
      	total.put(genres[i], total.getOrDefault(genres[i], 0)+plays[i]);
      	
      }
      
      
      for(String key : total.keySet()) {
    	  Genre genre = new Genre();
    	  
    	  genre.setAllPlay(total.get(key));
    	  genre.setGenre(key);
    	  
    	  totalList.add(genre);
      }
      Collections.sort(totalList);
     
      List<Integer> finalList = new ArrayList<Integer>();
      
      for(int i=0; i<totalList.size(); i++) {
    	  int cnt = 0;
    	  for(int j=0; j<list.size(); j++) {
    	  if(list.get(j).getGenre().equals(totalList.get(i).getGenre())){
    		 finalList.add(list.get(j).getSongNum());
    		 
    		 cnt++;
    	  	}
    	  if(cnt==2) {
    		  break;
    	  }
    	  }
    	  
      }
     
        
        
        
        
        
        
		
		
		
      int[] answer = new int[finalList.size()];
    for(int i=0; i< finalList.size(); i++) {
 	   answer[i] = finalList.get(i);
 	   
 	  
    }
        return answer;
               
    }
	
	public static void main(String[] args) {
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		System.out.println(Arrays.toString(solution(genres,plays)));
	}
}
