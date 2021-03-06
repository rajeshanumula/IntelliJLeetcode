import java.util.*;

public class SubsetsII {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<=nums.length;i++) {
			List<Integer> list=new ArrayList<Integer>();
			helper(nums, i, list,0);
		}
		return result;
	}
	public void helper(int[] nums,int len,List<Integer> list,int cur) {
		if(len==0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=cur;i<nums.length;i++) {
			if(i>cur && nums[i-1]==nums[i]) continue;
			list.add(nums[i]);
			helper(nums, len-1, list,i+1);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		SubsetsII sub = new SubsetsII();
		int[] nums = { 1,1};
		sub.subsetsWithDup(nums);
	}

}
