package Chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class MyList {
    private List list = new ArrayList<String>();

    public void  add(){
        list.add("ABC");
    }

    public int size(){
        return list.size();
    }
}
