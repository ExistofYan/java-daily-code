package MidTerm27710;

public class test1 {

        public static void print(int... nums) {
            System.out.println("varargs");
        }
        public static void print(Integer a, Integer b) {
            System.out.println("wrapper");
        }
        public static void main(String[] args) {
            print(1, 2);


            Integer a = 100;
            Integer b = 100;
            Integer x = 2000;
            Integer y = 2000;
            System.out.println(a == b);
            System.out.println(x == y);




        }

}
