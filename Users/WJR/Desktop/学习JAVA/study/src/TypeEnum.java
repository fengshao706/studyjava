public class TypeEnum {
    public enum Season{
        SPRING("SPRING",1),SUMMER("SUMMER",2),AUTUMN("AUTUMN",3),WINTER("WINTER",4);
        private String name;
        private int number;
        Season(String name,int number){
            this.name=name;
            this.number=number;
        }
    }

    public static void main(String[] args) {
        Season []seasons=Season.values();//values()方法返回的是一个数组，所以要先定义一个数组
        for(int i=0;i<seasons.length;i++){//遍历赋值后的seasons数组
            System.out.print(seasons[i]+"  ");
        }
        System.out.println();
        System.out.println("AUTUMN的顺序值是："+Season.AUTUMN.ordinal());//ordinal()返回的是枚举常量的顺序值
        System.out.println(Season.valueOf("WINTER"));//valueOf()返回的是指定名称的对象的枚举类型
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));//compareTo方法可以将两个枚举对象进行比较，若相等则返回值是0，不相等返回值为-1
    }
}
