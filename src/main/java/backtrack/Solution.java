package backtrack;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,3,4};
        solution.combinationSum(arr,8);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
             /*   for(int k=0; k<cur.size();k++) {
                    System.out.println(cur.get(k));
                }
                System.out.println("===");*/

                cur.remove(cur.size() - 1);
                for(int p=0; p<cur.size();p++) {
                    System.out.println(cur.get(p));
                }
                System.out.println("===");

            }//for
        }//if
        else if(target == 0 ){
            for(int k=0; k<cur.size();k++) {
                System.out.println(cur.get(k));
            }
            System.out.println("result===");
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }
}
