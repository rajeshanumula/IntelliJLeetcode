import java.util.*;
public class IndicatorDiff {
    public static long maxProfit(int k, List<Integer> profit){
        int halfSize=profit.size()/2;
        long curProfit=0;
        for(int j=0;j<k;j++){
            curProfit=curProfit+profit.get(j)+profit.get(j+halfSize);
        }
        long maxProfit=curProfit;
        for(int i=0;i<halfSize;i++){
            curProfit=curProfit-profit.get(i)-profit.get(i+halfSize);
            curProfit=curProfit+profit.get(i+k)+profit.get((i+halfSize+k)%profit.size());
            maxProfit= maxProfit<curProfit?curProfit:maxProfit;
        }
        return maxProfit;
    }
    public static void main(String[] args){
        List<Integer> arr=Arrays.asList(1,5,1,3,7,30,12,13);
        long res=maxProfit(2,arr);
        System.out.println(res);
    }
}
