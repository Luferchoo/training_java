import java.util.ArrayList;

public class example3_3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(0);
        System.out.println(list.get(1)+list.get(2));
    }
}
