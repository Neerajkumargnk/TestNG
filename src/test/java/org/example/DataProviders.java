package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    @DataProvider(name="mylogindata")
    public Object[][] getloginData(){
        Object[][] data = {{11904448,"Neeraj","Hyd"},{11904488,"mawabro","banglore"},{45678,"nkdcvbjiuy","delhi"}};
        return data;
    }
    @Test(dataProvider = "mylogindata")
    public void loginForm(int reg, String name,String city){
        System.out.println(reg + " -> " + name +" -> "+ city);
    }
}
//their is another way to
//it is used for DDT which means same testcase can be run with different set of data.it is very powerful feature
// and effectivily used during framework development.
//annotations methods returns an array of the object