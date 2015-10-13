package com.telos.hyd.Styles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by karthikmarupeddi on 10/8/15.
 */
public class TimeUtil {

    public static List<String> getMonths(){
        String[] months =  new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        List<String> stringList = new ArrayList<String>(Arrays.asList(months));
        return  stringList;
    }

}
