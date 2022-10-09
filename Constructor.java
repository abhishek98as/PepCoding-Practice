public class Constructor {
    String name;
    int rollNo;
    float percentage;

    Constructor(){

//        this.name="mrssingh";
//        this.rollNo=5;
//        this.percentage=80;
    }

    void greetings(){
        System.out.println("Hello my name is "+this.name+" my Roll numer "+this.rollNo+" and "+this.percentage);
    }

    public static void main(String[] args) {
        Constructor abhi=new Constructor();
        Constructor shek=new Constructor();
//        abhi.name="mrssingh";
//        abhi.rollNo=5;
//        abhi.percentage=80;

        abhi.greetings();

        shek.name="ssingh1official";
        shek.rollNo=51;
        shek.percentage=75;

        shek.greetings();

    }
}
