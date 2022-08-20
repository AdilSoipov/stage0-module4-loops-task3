package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        
        
        int r, sum=0;
        
        while(t>0) {
            
            r = t % 10;
            sum = sum + r;
            t = t / 10;
                        
        }
        
        System.out.println(sum);
        
        

    }
}
