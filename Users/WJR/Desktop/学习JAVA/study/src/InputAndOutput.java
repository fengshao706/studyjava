import java.io.*;
import java.util.Scanner;

public class InputAndOutput {//使用字节流进行数据的写入和读取
    public void writeFile(int num){
        var outputFile=new File("testOutput.txt");

        try{
            var output=new FileOutputStream(outputFile,false);
            output.write(num);
            output.close();
        } catch (IOException o) {
            throw new RuntimeException(o);
        }
    }
    public void inputFile(){
        try{
            var input =new FileInputStream("testOutput.txt");
            int c=input.read();
            while(c!=-1){
                System.out.print(c);
                c=input.read();
            }
        }catch(IOException i){
            throw new RuntimeException(i);
        }
    }

    public static void main(String[] args) {
        InputAndOutput io=new InputAndOutput();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要写到文件中的整数");
        int num = scanner.nextInt();
        io.writeFile(num);
        io.inputFile();
    }
}
