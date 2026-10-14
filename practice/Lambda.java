import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Lambda {
    static void main() {


        BinaryOperator<Integer> add = (x, y) -> x + y;

        System.out.println(add.apply(3, 5)); // 8


        //using new Comparator<>{@Override}
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("java");arrayList.add("python");arrayList.add("julia");arrayList.add("Zod");
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(arrayList);
        //using lambda
        Collections.sort(arrayList,(x,y)->Integer.compare(y.length(),x.length()));
        System.out.println(arrayList);

        BinaryOperator<Integer> binaryOperator=(x,y)->{
            System.out.println("what fuck");
            return 55;
        };
        System.out.println(binaryOperator.apply(1,2));

        Calculator calculator = new Addition();
        System.out.println(calculator.calculate(3, 5));
        // 8
        //but with lambda only
        Calculator calculator1=(a,b)->{return a*b;};//override the abstract method
        System.out.println(calculator1.calculate(10,10));

        Supplier<Double> supplier=()-> Math.random()*6;
        System.out.println(supplier.get());





    }
}
