public class SuperAndFinal {
    public class Test01{//final加在类前面时，该类无法被继承
        final public void testFinal(){//final加在方法前面时，派生类无法重写这个方法
            System.out.println("测试final关键字,这是在父类");
        }
        public void testSuper(){
            System.out.println("测试super关键字,这是在父类");
        }
    }

    public class Test02 extends Test01{
        @Override
        public void testSuper(){
            System.out.println("测试super关键字，这是在子类");
        }
        //public void testFinal(){
        //因为基类中的testFinal方法中加了final关键字，所以派生类中无法重写这个方法
        //}
        public void test(){//super关键字的作用是能够让派生类调用基类的成员变量和成员方法
            super.testSuper();
        }
    }

    public static void main(String[] args) {
        Test01 test01=new SuperAndFinal().new Test01();
        Test02 test02=new SuperAndFinal().new Test02();
        test02.testSuper();//测试覆盖后的testSuper方法
        test02.test();//测试super关键字的作用
        test02.testFinal();//测试在派生类中调用基类成员方法
    }
}
