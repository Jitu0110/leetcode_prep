class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int boatCount=0;
        int smallGuyPointer=0;
        
        //Don't really need to maintain sum 
        
        //Sort ascending order
        Arrays.sort(people);
        
        for(int i=people.length-1;i>=smallGuyPointer;i--){
            
            //When both pointers meet
            if(i==smallGuyPointer){
                boatCount++;
                break;
            }
  
            //When the current person occupies the whole boat
            if(people[i]==limit){
               boatCount+=1;
               continue;
            }
           
            //When the two people exactly fit in one boat (best case)
            if(people[i]+people[smallGuyPointer]<=limit){
                 smallGuyPointer+=1;
                 boatCount+=1;
                 continue;
            }
            boatCount+=1;
           
        }
        return boatCount;

    }
}