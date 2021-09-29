package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Number_42579 {
	
	static class Song{
		int num;
		int playNum;
		Song(int num, int playNum){
			this.num = num;
			this.playNum = playNum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = {"classic", "pop", "classic", "classic", "pop"};
		int plays[] = {500, 600, 150, 800, 2500};
		 solution(strs, plays) ;
		
	}
	public  static int[] solution(String[] genres, int[] plays) {
		List<Integer> answerList = new ArrayList<Integer>();
        
        HashMap<String, ArrayList<Song>> songs = new HashMap<String, ArrayList<Song>>();
        HashMap<String, Integer> total = new HashMap<String, Integer>();
        
        for(int i = 0; i<genres.length; i++) {
        	if(songs.get(genres[i]) == null)
        		songs.put(genres[i], new ArrayList<>());
        		
        	songs.get(genres[i]).add(new Song(i, plays[i]));
        	if(total.get(genres[i]) == null)
        		total.put(genres[i], 0);
        	
        	total.put(genres[i], total.get(genres[i]) + plays[i]);
      }
        
        
        List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(total.entrySet());
        
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
        	@Override
        	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        		// TODO Auto-generated method stub
        		return o2.getValue().compareTo(o1.getValue());
        	}
		}  );
        
        for(Entry<String, Integer> entry : list) {
        	
        	ArrayList<Song> songList = songs.get(entry.getKey());
        	songList.sort(new Comparator<Song>() {
        		@Override
        		public int compare(Song o1, Song o2) {
        			// TODO Auto-generated method stub
        			return o2.playNum - o1.playNum;
        		}
			});
        	
        	for(int i=0; i <songList.size(); i++) {
        		if(i ==2)
        			break;
        		answerList.add(songList.get(i).num);
        		
        	}
        	
        }
        
        int answer[] = new int[answerList.size()];
        for(int i=0; i <answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}
