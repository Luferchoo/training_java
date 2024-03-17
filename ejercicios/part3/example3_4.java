import java.util.ArrayList;

public class example3_4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        System.out.println(list.get(1)+list.get(2));
    }
}
