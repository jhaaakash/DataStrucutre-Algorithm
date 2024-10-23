import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {
    public static boolean containsDuplicate(Integer[] arr)
    {
        List<Integer> ls = new ArrayList<>();
        Collections.addAll(ls, arr);
        int lsSize= ls.size();

        HashSet hs= new HashSet<>();
        hs.addAll(ls);
        int hsSize=hs.size();
        
        if(lsSize==hsSize)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5,6};
        System.out.println("========Before=============");
        System.out.println(containsDuplicate(numbers));
        System.out.println("===========Operation Finished");     
    }
}
