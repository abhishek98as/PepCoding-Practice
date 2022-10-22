public class polymorhism_new{
        void Print()
        {
            System.out.println("parent class");
        }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    }
    class subclass1 extends polymorhism_new {
        void Print()
        {
            System.out.println("subclass1");
        }
        void sum(int a,int b,int c)
        {
            System.out.println(a+b+c);
        }
    }
    class subclass2 extends polymorhism_new {
        void Print()
        {
            System.out.println("subclass2");
        }

        void sum(int a, int b,int c){System.out.println(a+b);
        }
    }

    class GFG {

        public static void main(String[] args)
        {

            polymorhism_new a = new subclass1();
            polymorhism_new w= new polymorhism_new();
            polymorhism_new a1 = new subclass2();
            a.sum(20,40,50);


            w.sum(10,20,30);

            a1.sum(10,20,30);



        }


    }