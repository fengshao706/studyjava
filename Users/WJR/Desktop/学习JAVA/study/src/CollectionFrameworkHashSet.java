import java.util.HashSet;

public class CollectionFrameworkHashSet {//练习HashSet集合的使用
    public class Test01{
        private HashSet<String>names=new HashSet<>();
        public void addName(String name){
            names.add(name);
        }
        public void printAll(){
            System.out.println(names);
        }
        public void addCalculate(HashSet<String> other){//实现两个集合之间的并运算
            names.addAll(other);
        }
        public void retainCalculate(HashSet<String>other){//实现两个集合之间的交运算
            names.retainAll(other);
        }
    }
    public static void main(String[]args){
        Test01 test01=new CollectionFrameworkHashSet().new Test01();
        test01.addName("Tom");
        test01.addName("Mary");//注意HashSet集合不能有相同的元素，并且添加的元素没有固定的顺序
        test01.addName("Harry");
        test01.printAll();
    }
}
