package codingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Number1 {
	public static void main(String[] args) {
	
	solution(4578, new int[]{1, 4, 99, 35, 50, 1000});
	}
	
	static class Pair{
		int index;
		int cost;
		public Pair(int index, int cost) {
			super();
			this.index = index;
			this.cost = cost;
		}
	}
	
    public static  int solution(int money, int[] costs) {
        int coin[] = {1,5,10,50,100,500};
        List<Pair> list = new ArrayList<Pair>();
      
        list.add(new Pair(0, costs[0]*500));
        list.add(new Pair(1, costs[1]*100));
        list.add(new Pair(2, costs[2]*50));
        list.add(new Pair(3, costs[3]*10));
        list.add(new Pair(4, costs[4]*5));
        list.add(new Pair(5, costs[5]));
        
        list.sort(new Comparator<Pair>() {
        	@Override
        	public int compare(Pair o1, Pair o2) {
        		// TODO Auto-generated method stub
        		return o1.cost - o2.cost;
        	}
		});
            
        int min = 0;
        for(int i =0; i<list.size(); i++) {
        	int index = list.get(i).index;
        	min  += (money / coin[index]) * costs[index];
        	money = money%coin[index];
        }
        
        return min;
    }
}
