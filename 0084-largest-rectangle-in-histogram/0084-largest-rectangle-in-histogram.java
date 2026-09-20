class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s = new Stack<>() ; 
        int n = heights.length; 
       int[] nsl  = new int[n]; 
        int[] nsr  = new int[n];  
         //nsl
         for ( int i = 0 ; i < n ; i++ )
         { while(!s.empty() && heights[s.peek()] >= heights[i] )
         {s.pop() ;  }
         if (s.empty()) nsl[i] = -1 ; 
         else { nsl[i] = s.peek() ;}

        s.push(i) ; }
        
        s.clear();

        //nsr
        for ( int i = n-1 ; i >= 0 ; i-- )
         { while(!s.empty() && heights[s.peek()] >= heights[i] )
         {s.pop() ;  }
         if (s.empty()) nsr[i] = n ; 
         else { nsr[i] = s.peek() ;}

        s.push(i) ; }


        //largestRectangle 
        int maxArea = 0 ;
        for( int i = 0 ; i < n  ; i++  )
        { int currArea = heights[i]*(nsr[i]-nsl[i]-1) ; 
        
        maxArea = Math.max(maxArea, currArea) ; }

        return maxArea ; 


         }
        
    }
