public class abhi {
    public static void main(String[] args) {
        int N = 9;
        int A= 8;
        int B = 2;
        int profit=0;
        while(N!=1)
        {
            for(int i=2; i<=N;i++)
            {
                if(N%i==0)
                {
                    N=N%i;
                    i=2;
                    if(N%2==0)
                    {
                        profit = profit+B;
                    }
                    else
                    {
                        profit = profit+A;
                    }
                }
            }
        }
        System.out.println(profit);
    }
}
