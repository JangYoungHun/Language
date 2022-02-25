package study;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BoyerMoore {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			char[] str = br.readLine().toCharArray();
			char[] p = br.readLine().toCharArray();
			
			int arr[] = new int['z'-'a'+1];
			
			Arrays.fill(arr, p.length);
			
			for(int i=0; i<p.length; i++) {
				arr[p[i]-'a'] = p.length-1-i;
			}
			
			int index = p.length-1;
			int pp = p.length-1;
			
			boolean result = false;
			while(index < str.length) {
				int cnt = 0;
				for(int k=0; k<p.length; k++) {
					if(str[index-k] != p[pp-k]) {
						index += arr[str[index] - 'a']; 
						pp = p.length-1;
						break;
					}
					cnt++;
				}
				
				if(cnt == p.length) {
					result = true;
					break;
				}

			}
			
			bw.write(result ? "1" :"0");
			
			bw.flush();
			br.close();
			bw.close();
			}
		

	}


