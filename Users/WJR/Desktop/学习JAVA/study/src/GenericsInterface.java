public class GenericsInterface {

    interface test01able<T>{
        void test(T t);
    }
    public class Test01 implements test01able<String>{
        public void test(String s1){
            System.out.println(s1);
        }
    }
    public static void main(String[]args){
        GenericsInterface genericsInterface=new GenericsInterface();
        Test01 test01=genericsInterface.new Test01();
        test01.test("test output");
    }
}
