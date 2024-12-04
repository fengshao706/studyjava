public class TypeRecord {//注意记录类型是final，即它不可以被继承
    public record Person(String name,String sex,int age){//记录类型的定义方法
        void getData(){//记录类型内部也可以定义成员
            System.out.println("name:"+name+"   sex:"+sex+"   age:"+age);
        }
    }
    public static void main(String[] args) {
        Person person=new Person("wang","man",18);//实例化记录类型时需要把参数传进去
        System.out.println(person.name());
        System.out.println(person.sex());//获取记录类型数据的语法
        System.out.println(person.age());
        person.getData();//也可以使用记录类型内部的成员
    }
}
