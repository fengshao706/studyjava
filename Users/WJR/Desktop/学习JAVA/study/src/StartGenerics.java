public class StartGenerics {
    public class Test01<T1>{   //泛型的练习
        private T1 data;  //T1是泛型成员
        public Test01(T1 data){//带参数构造方法
            this.data =data;
        }
        public T1 get(){  //访问方法定义，这里的T1相当于返回值类型，即相当于void,int之类的
            return data;
        }
        public void set(T1 data){//修改方法定义
            this.data =data;//注意返回值为void，需要在程序中先修改才能输出
        }
        public void showType(T1 data){
            System.out.println("T1的类型是"+data.getClass().getName());//获取T1的类型
        }
    }
    public static void main(String[] args) {
        StartGenerics startGenerics =new StartGenerics();
        var T1=Integer.valueOf(12);
        var T2=Float.valueOf(6.67f);

        StartGenerics.Test01<Integer> test01= startGenerics.new Test01<>(T1);//创建内部类实例时，左边的是未实例化的，右边的是实例化的
        System.out.println("测试访问方法"+test01.get());
        test01.set(20);//修改
        System.out.println("测试修改方法"+test01.get());
        test01.showType(T1);

        StartGenerics.Test01<Float> test02= startGenerics.new Test01<>(T2);
        System.out.println("测试访问方法"+test02.get());
        test02.set(8.87f);//修改
        System.out.println("测试修改方法"+test02.get());
        test02.showType(T2);
    }
}
