package Q5;

import java.util.ArrayList;
import java.util.List;

public class MainQ5 {
    public static void main(String[] args) {
     MyProtectedUniqueList uniqueList=new MyProtectedUniqueList("123456");
     uniqueList.Add("jkj");
     uniqueList.Add("popo");
     uniqueList.Add("abc");
     uniqueList.Add("abb");
     System.out.println(uniqueList.getWords());
     uniqueList.Sort("123456");
        System.out.println(uniqueList.getWords());
        MyProtectedUniqueList uniqueList2=new MyProtectedUniqueList("3245");
        uniqueList2.Add(1.5);
        uniqueList2.Add(2.5);
        uniqueList2.Add(6.5);
        uniqueList2.Add(5.8);
        System.out.println(uniqueList2.getWords());
        uniqueList2.Sort("3245");
        System.out.println(uniqueList2.getWords());

        for(var i:uniqueList2.getWords()){
            System.out.println(i);
        }
    }
}
