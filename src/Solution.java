

public class Solution {
    //metod yaradılır -> nəticə olaraq true və ya false dəyərini döndərəcək
    public boolean containsDuplicate(int[] nums) { //given an integer array ->> nums
        java.util.Arrays.sort(nums);//sıralama bizə eyni ədədlər qonşu vəziyyətə gəlir deyə kömək edir.
        for(int i=0;i<nums.length-1;i++){//loop-dur, massivdə bütün elementləri gəzəcək
            if (nums[i] == nums[i+1]){
                return true; // return true if any value appears at least twice in the array
            }
        }
        return false;// and return false if every element is distinct.
    }
}
