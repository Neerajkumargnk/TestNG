package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    @Test(dataProvider = "mylogindata",dataProviderClass = DataProviders.class)
    public void loginForm(int reg, String name,String city){

        System.out.println(reg + " -> " + name +" -> "+ city);
    }
}
//their is another way to
//it is used for DDT which means same testcase can be run with different set of data.it is very powerful feature
// and effectivily used during framework development.
//annotations methods returns an array of the object