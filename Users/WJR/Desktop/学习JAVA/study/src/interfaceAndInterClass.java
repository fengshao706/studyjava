public class interfaceAndInterClass {
    public interface Test01 {
        static void test3(){//静态方法也不能被类继承，只能在本类中被调用
            System.out.println("测试接口中的静态方法");
        }
        private void test2(){//私有方法的作用是让这个方法给类内的默认方法调用
            System.out.println("测试接口中的私有方法");
        }
        default void test1(){         //定义接口中的默认方法
            System.out.println("测试接口中的默认方法");
            test2();
            test3();
        }
    }
    public class Test02 implements Test01 {

    }

    public static void main(String[] args) {
        Test02 test02=new interfaceAndInterClass().new Test02();//实例化内部类的语法
        test02.test1();//调用接口中的默认方法的语法

    }
}
