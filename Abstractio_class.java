abstract class Animal {
     abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

    class Pig extends Animal {
        public void animalSound() {

            System.out.println("The pig says: wee wee");
        }
    }
class Abstractio_class{
        public static void main(String[] args) {
        Pig p=new Pig();
        p.sleep();
        p.animalSound();

    }
    }
