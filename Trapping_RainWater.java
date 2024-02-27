//Difficulty: Hard
//Runtime: 0 ms
//Memory Usage: 46.8 MB

class Solution {
    public int trap(int[] height) {
        int units=0;
        int store=0;
        int l=0;
        int r=height.length-1;
        int maxl=height[l];
        int maxr=height[r];
        while(l<r){
            if(Math.min(maxl,maxr)==maxl){
                l++;
                store=maxl-height[l];
                if(store>=0){
                    units=units+store;
                    //System.out.println("Units stored= "+units+"At l= "+l);
                }
                if(height[l]>maxl){
                    maxl=height[l];
                }
            }else{
                r--;
                store=maxr-height[r];
                if(store>=0){
                    units=units+store;
                    //System.out.println("Units stored= "+units+"At r= "+r);
                }
                if(height[r]>maxr){
                    maxr=height[r];
                }
            }

        }
        return(units);
        
    }
}
