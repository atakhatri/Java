import packages.swapper;
public class swap_nums {
    public static void main(String[] args) {
        swapper object = new swapper();

        int a = 12;
        int b = 33;
        System.out.println("value of a before swapping : " + a);
        System.out.println("value of b before swapping : " + b);

        object.swap(a,b);
        
        System.out.println("value of a after swapping : " + a);
        System.out.println("value of b after swapping : " + b);
    }
}
