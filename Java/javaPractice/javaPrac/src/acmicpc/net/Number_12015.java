package acmicpc.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//https://www.acmicpc.net/problem/12015
//ÇØ°á
public class Number_12015 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		List<Integer> list = new ArrayList<Integer>();
		list.add(0);

		for (int i : arr) {
			if (list.get(list.size() - 1) < i)
				list.add(i);
			else {
				int index = binarySearch(list, i);
//				if(index < 0)
//				index = (index + 1) * (-1);
				list.set(index, i);
			}
		}

		System.out.println(list.size() - 1);

		bw.flush();
		bw.close();
		br.close();
	}

	static int binarySearch(List<Integer> list, int num) {
		int left = 0;
		int right = list.size() - 1;

		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (list.get(mid) == num)
				return mid;
			else if (list.get(mid) > num)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return left;
	}

}
