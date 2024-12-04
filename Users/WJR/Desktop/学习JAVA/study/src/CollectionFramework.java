import java.util.ArrayList;

public class CollectionFramework {//练习集合的使用
    public class Test01 {
        private ArrayList<String>names=new ArrayList<String>();//定义一个关于集合的全局变量
        public void addOnePerson(String name){
            names.add(name);  //添加一个元素
        }
        public void insertOnePerson(int index, String name){
            names.add(index,name);//在指定位置添加一个元素
        }
        public void getOnePerson(int index){
            System.out.println(names.get(index));//获取指定位置的元素
        }
        public void setOnePerson(int index,String name){
            names.set(index,name);//修改指定位置的元素
        }
        public void removeOnePerson(int index){
            names.remove(index);//删除指定位置的元素
        }
        public void insertCollectionPerson(int index,ArrayList<String> other){
            names.addAll(index,other);//在指定位置插入一个集合
        }
        public void firstAppearance(String s){
            System.out.println(names.indexOf(s));//查找某个元素第一次出现的位置
        }
        public void lastAppearance(String s){
            System.out.println(names.lastIndexOf(s));//查找某个元素最后一次出现的位置
        }
        public void printAll(){
            System.out.println(names);//打印输出整个集合
        }
    }
    public static void main(String[] args) {
        Test01 test01=new CollectionFramework().new Test01();
        test01.addOnePerson("Harry Potter");
        test01.addOnePerson("LionKing");
        test01.addOnePerson("Peppa Pig");
        test01.printAll();
        test01.insertOnePerson(1,"Mickey Mouse");
        test01.printAll();
        test01.setOnePerson(2,"Tom");
        test01.printAll();
        test01.removeOnePerson(3);
        test01.printAll();
        test01.getOnePerson(2);
        test01.firstAppearance("Tom");
    }
}
