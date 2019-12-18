import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author 黄晓阳
 * @Date 2019-09-23 16:12
 */

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(4);
        System.out.println(Collections.frequency(list, 7));
    }
}
