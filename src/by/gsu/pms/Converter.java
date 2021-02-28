
package by.gsu.pms;

public class Converter {
    private final double divider;
    private final int decimalPlaces ;

    public Converter(double divider, int decimalPlaces ){
        this.divider = divider;
        this.decimalPlaces  = decimalPlaces ;
    }

    public void convert(Trip employee){
        double scale = Math.pow(10, decimalPlaces);
        System.out.println("rate = " + Math.round((Trip.RATE /divider)*scale)/scale );
        System.out.println("transport = " + Math.round((employee.getTransport()/divider)*scale)/scale);
        System.out.println("days = " + employee.getDays());
        System.out.println("account = " + employee.getAccount());
        System.out.println("total = " + Math.round((employee.getTotal()/divider)*scale)/scale);

    }
}