package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        	
		 int sum=0,i;
		 int lengthOfLastNumber = 8;
	     
	     
	     int p=9;
	     for(i=1;i<=lengthOfLastNumber;i++)
	     {
	             sum+=p;
	             p=(p*10)+9;
	     }
	     System.out.println(sum);
	     

    }
}
