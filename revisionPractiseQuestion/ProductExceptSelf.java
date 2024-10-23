public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int count=0;
        int product=1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else{
                product *=nums[i];
            }
        }

        for(int i=0; i<nums.length;i++)
        {
            if(count==1 && nums[i] !=0)
            {
                ans[i]=0;
            }
            else if(count ==1 && nums[i]==0)
            {
                ans[i]=product;
            }
            else if(count >=2)
            {
                ans[i]=0;
            }
            else{
                ans[i]=product/nums[i];
            }
        }
return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf obj =new ProductExceptSelf();
       
  int[] productfinal=obj.productExceptSelf(nums); 
  for (int i : productfinal) {
    System.out.println(i);
  }
    }
}
