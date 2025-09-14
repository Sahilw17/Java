import java.util.Arrays;
public class Cli_avg {
    public static void main(String[] args) {
        double[] nums=new double[args.length];
        for(int i=0;i<args.length;i++){
            nums[i]=Double.parseDouble(args[i]);
        }
        double sum=0;
        for(double n: nums)
        {
             sum+=n;
        }
        double avg=sum/nums.length;

        double min=nums[0],max=nums[0];
        for (double n:nums){
            if (n<min)
            min=n;
            else if (n>max)
            max=n;
        }

        Arrays.sort(nums);

        System.out.println("Average: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.print("Ascending order: ");
        for (double n : nums) System.out.print(n + " ");
    }
}