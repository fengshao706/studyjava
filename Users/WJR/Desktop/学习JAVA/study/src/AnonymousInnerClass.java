public class AnonymousInnerClass {
    interface Test01{//定义一个简单的接口方便后面的测试
        void test();
    }
    public static void main(String[] args) {
        Test01 test01=new Test01(){//匿名内部类的语法就是将实例化与定义类同时进行
            @Override
            public void test(){
                System.out.println("测试匿名内部类");
            }
        };
        test01.test();//调用匿名内部类中的test方法
    }
}
