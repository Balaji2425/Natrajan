import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuffer sb=new StringBuffer(str);
        StringBuffer rstr=sb.reverse();
        System.out.println(rstr);
    }
}
