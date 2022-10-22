import java.util.ArrayList;
import java.util.Collections;

public class TwoArry_sort_index
{
    public static void main(String[] args) {
        //        int[] q={9,2};
        //        int[] arr = {6,1,7,3};
//        for(int i=0; i<N;i++){A.add(arr[i]);}
        int N=4;
        ArrayList<Integer> A= new ArrayList<>();
        int Q= 2;
        ArrayList<Integer> Queries= new ArrayList<>();


        int[] q= new int[Q];

        for(int i=0; i<Q;i++)
        {
            q[i]=Queries.get(i);
        }
        Collections.sort(A);
        int ans=0;
        for(int i=0; i<Q;i++)
        {
            if(!A.contains(q[i]))
            {
                int j=0;
                while(q[i]>A.get(j))
                {
                    j++;
                    if(j> A.size()-1)
                    {
                        break;
                    }
                }
                if(j>ans && j!=0)
                {
                    ans =j+1;
                }
            }
        }
        System.out.println(ans);
    }
}
