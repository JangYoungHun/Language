package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_11723 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Boolean> all = new HashMap<String, Boolean>();
		for(int i=1; i<=20; i++) {
			all.put(String.valueOf(i), true);
		}
		
		HashMap<String, Boolean> h = new HashMap<String, Boolean>();
		
		for(int i=0; i<n; i++) {
			String[] input =br.readLine().split(" ");
			String command = input[0];
			String num= "";
			if(!command.equals("all") && !command.equals("empty")) {
				num= input[1];
			}
			
			
			switch(command) {
			case "add": h.put(num, true); break;
			case "remove": h.computeIfPresent(num, (k,v) -> false ); break;
			case "check":
				bw.write( (h.get(num) == null || h.get(num) == false ) ? "0" : "1");
				bw.write("\n");
				break;
			case "toggle":
				if(h.get(num) == null || h.get(num) == false) {
					h.put(num, true);
				}else {
					h.put(num, false);
				}
				break;
			case "all": 
				h = new HashMap<String, Boolean>(all); break;
			case "empty": 
				h = new HashMap<String, Boolean>(); break;
			}
			
		}
		
		
		bw.flush();
		br.close();
		bw.close();
		}


}
