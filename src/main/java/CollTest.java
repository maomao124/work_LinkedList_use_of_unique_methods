import java.util.LinkedList;
import java.util.Scanner;

/**
 * Project name(项目名称)：作业_List的LinkedList之特有方法的使用
 * Package(包名): PACKAGE_NAME
 * Class(类名): CollTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 20:41
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CollTest
{
    public static void main(String[] args)
    {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收给定的一行字符串
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // 第二步：切割字符串
        String[] str1 = str.split(",");
        // 第三步：创建集合
        LinkedList<String> p = new LinkedList<>();
        // 第四步：将切割后的元素添加进集合
        for (String s : str1)
        {
            p.add(s);
        }
        // 第五步：替换首尾元素
        p.set(0, "aa");
        p.set(p.size() - 1, "aa");
        // 第六步：打印集合
        System.out.println(p);

        /********** End **********/
    }
}
