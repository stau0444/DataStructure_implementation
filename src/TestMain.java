import javax.lang.model.SourceVersion;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        array.addElement(6);
        array.addElement(7);
        int length = array.size();
        System.out.println("length = " + length);

        array.replace(1 ,10 );
        int changedValue = array.get(2);

        int removeElement = array.removeElement(0);
        System.out.println("removeElement = " + removeElement);
        int i = array.get(0);
        System.out.println(i);


    }
}
