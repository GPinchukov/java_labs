package by.gsu.pms;

public class Converter {
    private final double divider;
    private final int decimalPlaces ;

    public Converter(double divider, int decimalPlaces ){
        this.divider = divider;
        this.decimalPlaces  = decimalPlaces ;
    }

    public double convert(int value){
        double scale = Math.pow(10, decimalPlaces );
        return Math.round((value/divider)*scale)/scale;
    }
}