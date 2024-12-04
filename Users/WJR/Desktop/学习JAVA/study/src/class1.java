import java.util.Scanner;
public class class1 {
    public static class person{
        private int age;
        private String name;
        private String sex;
        public person(){
            System.out.println("这是一个人");
        }
        public  void display(){

            Scanner s=new Scanner(System.in);
            System.out.println("请输入人名");
            name=s.nextLine();
            System.out.println("请输入年龄");
            age=Integer.parseInt(s.nextLine());
            System.out.println("请输入性别");
            sex=s.nextLine();
            System.out.println(""+name+age+sex);
        }
    }
    public static void main(String[]args){
        person p1=new person();

        p1.display();

        }

}

