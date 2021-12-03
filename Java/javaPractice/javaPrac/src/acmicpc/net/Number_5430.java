package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

//https://www.acmicpc.net/status?user_id=wdg2325&problem_id=5430&from_mine=1
// �ذ�
public class Number_5430 {

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
	
		Loop1 :
		for(int i=0; i< testCase; i++) {
			
			char command[] = br.readLine().toCharArray();
			int n =Integer.parseInt(br.readLine());
			String str = br.readLine();
			
			if(n !=0) {
			str = str.substring(1, str.length()-1);
			
			int arr[] = Stream.of(str.split(",")).mapToInt(Integer::parseInt).toArray();
			
			boolean isError = false;
			Deque<Integer> deque = new ArrayDeque<>();
			int direction = 0;    // 0 �� 1  ��   
				
			for(int j =0; j<n; j++) {
			   deque.addLast(arr[j]);
			}

			//��ɾ� ����
			for(char ch : command) {
				if(ch=='R') {		
					direction = (direction+1)%2; 
				}				
				else{
					// ť�� ������� ����
					if(!deque.isEmpty()) {
						if(direction == 0) 
							deque.pollFirst();					
						else
							deque.pollLast();
				}	
					// ť�� �������
					else {
						bw.write("error\n");
						continue Loop1;
					}
				}
			}		
			
		
			bw.write("[");
			
			if(direction == 0) {
				while(!deque.isEmpty()) {
					bw.write(String.valueOf(deque.pollFirst()));
					if(!deque.isEmpty())
						bw.write(",");
				}
			}
			else {
				while(!deque.isEmpty()) {
					bw.write(String.valueOf(deque.pollLast()));
					if(!deque.isEmpty())
						bw.write(",");
				}
			}
			bw.write("]\n");
			bw.flush();
		
				
		}
			// n �� 0 �̶��
			else {
				boolean isError = false;
				for(char ch : command) {
					if(ch =='D') {
						bw.write("error\n");
						continue Loop1;
					}
				}

				bw.write("[]\n");
			}
			
			
			
			
			
		}
		
	
		
		bw.close();
		br.close();
	}

}

