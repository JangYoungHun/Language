package acmicpc.net;

	class Solution {


		public static void main(String args[]) {
			int arr[] = { 2, 0, 1, 1, 1};
			System.out.println(solution(3, 2, arr ) );
		}
	
		
	    public static  String solution(int U, int L, int[] C) {
	        
	        int cnt2 =0;
	        int cnt1 =0;        
	        for(int i=0; i<C.length; i++){
	            if(C[i] == 2)
	                cnt2 ++;
	            else if(C[i] == 1)
	                cnt1 ++;
	        }
	        
	        int leftU = U - cnt2;
	        int leftL = L - cnt2;

	        int left = leftU + leftL;
	        int emptySlot = C.length-cnt2;

	        if(U<0 || L<0 || emptySlot < left)
	        return "IMPOSSIBLE";
	        
	       int arrayU[] = new int[C.length];
	       int arrayL[] = new int[C.length];

	        for(int i=0; i<C.length; i++){
        	
	            int num = C[i];
	            if(num == 2){
	                arrayU[i] =1;
	                arrayL[i] =1;

	            }    
	            else if(num == 1){
	                if(leftU <= leftL){
	                    arrayL[i] =1;
	                    arrayU[i] =0;
	                    leftL--;
	                }
	                else {
	                arrayL[i] =0;
                    arrayU[i] =1;
                    leftU--;
	                	
	                }
	            }
                
            else{
                arrayU[i] =0;
                arrayL[i] =0;
            }
	            
	       if(leftU <0 || leftL <0)
	    	   return "IMPOSSIBLE";
	            
	        }
	        
	       String str ="";
	       for(int i=0; i< arrayU.length; i++ ) {
	    	   str+=arrayU[i];
	       }
	       str  += ", ";
	       for(int i=0; i< arrayL.length; i++ ) {
	    	   str+=arrayL[i];
	       }
	       return str;
	    }
	    
}