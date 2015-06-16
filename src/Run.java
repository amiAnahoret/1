import com.cities.City;
import com.logistic.LogisticCenter;

public class Run {
    public static void main(String[] args) {
        //	LogisticCenter lc = new LogisticCenter();
        //  lc.createTransport();
        //  System.out.println();
        //  lc.createCities();
        //  System.out.println();
        //  lc.loadTransport(50, 20);
        LogisticCenter lc = new LogisticCenter();
        lc.checkAccessibility(new City("Moscow", 55.752, 37.615, false, true), new City("SPB", 59.894, 30.264, true, true));

    }

}