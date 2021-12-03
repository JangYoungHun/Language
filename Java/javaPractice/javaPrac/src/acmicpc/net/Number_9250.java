package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/9205
//ÇØ°á
public class Number_9250 {

	static class Node{
		
		int x;
		int y;
		
		Node(int x,int y	){
			this.x = x;
			this.y=y;
		}
	}
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(br.readLine());
			for(int p =0; p<t; p++) {
				
				int n = Integer.parseInt(br.readLine());
				
				List<Node> list = new ArrayList<Node>();
				int arr[][] = new int[n+2][n+2];
				
				for(int j =0; j<n+2; j++) {
					for(int k =0; k<n+2; k++) {
						arr[j][k]= 999999;
					}
				}
				
				for(int j =0; j<n+2; j++) {
					int xy[] =Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
					list.add(new Node(xy[0], xy[1]));
				}
				
				for(int j =0; j<n+2; j++) {
					for(int k =0; k<n+2; k++) {
						if(j==k) continue;						
						int distance = Math.abs(list.get(j).x-list.get(k).x) + Math.abs(list.get(j).y-list.get(k).y); 		
						if(distance <=1000) 
							arr[j][k] = 1;					
					}
				}
				
				 for(int k=0; k<n+2; k++) {
			            for(int i=0; i<n+2; i++) {
			                for(int j=0; j<n+2; j++) {
			                    if(arr[i][j] > arr[i][k] + arr[k][j])
			                        arr[i][j] = arr[i][k] + arr[k][j];
			                }
			            }
			        }
			    
				if(arr[0][n+1] != 999999)
					System.out.println("happy");
				else
					System.out.println("sad");
			}

			bw.flush();
			bw.close();
			br.close();
		}

	

}
