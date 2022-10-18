import java.util.ArrayList;

public class ArrayList_Introduction {
    public static <Arraylist> void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list+" + " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);

        for(int val1: list){
            System.out.println(val1);
        }

        System.out.println(list);
        // System.out.println(list.size());

        list.add(0,1000);
        System.out.println(list);

        int a=list.get(2);
        System.out.println(a);

        int b=list.set(0,2000);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);


        ArrayList<String>list1=new ArrayList<>();
        list1.add("harry");
        list1.add("potter");
        list1.add("movie");
        list1.add("naME");

        System.out.println(list1);

        list.get(1);

        System.out.println(list1);

        list1.set(1,"hello");
        System.out.println(list);

        list.remove(1);


        for(int i=0; i<list1.size(); i++){
            String value=list1.get(i);

            System.out.print(value+" ");
        }



    }
}
