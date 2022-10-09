import java.util.ArrayList;

public class counting_string_int_float {
    public static void main(String[] args) {
        String que = "Adeepak chtuiya hai 12 add 1.0 2.0 5.7 22 3000 times chutiya";
        String[]  arr = que.split(" ");

        ArrayList<String> lst = new ArrayList<String>();
//        lst = que.split(" ");
        int countF =0;
        int countI = 0;
        int countS = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i].contains("."))
            {
                countF++;
            }
            else
            {
                lst.add(arr[i]);
            }
        }
        for(int i=0; i<lst.size(); i++)
        {
            try
            {
                int a = Integer.parseInt(lst.get(i));
                countI++;
            }
            catch (Exception e)
            {
                countS++;
            }
        }

        System.out.println("Integer "+countI);
        System.out.println("String "+ countS);
        System.out.println("float "+ countF);

    }
}
