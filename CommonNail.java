import java.io.Serializable;

public class CommonNail extends Nail implements Serializable {

    private double gauge;
    private double length;
    private String size;

    private static final long serialVersionUID = -3326511820773602258L;

    public CommonNail(String sz, double len, double ga, String fin, double unitP, int npu) throws IllegalFastener{
        super(fin,unitP,npu);
        isValidGauge(gauge);
        gauge = ga;
        isValidLength(length);
        length = len;
        isValidSize(size);
        size = sz;
    }
    private void isValidGauge(double ga) throws IllegalFastener{
        if(!(ga == 2
                || ga == 8
                || ga == 9
                || ga == 10.25
                || ga == 11.5)){
            throw new IllegalFastener("Illegal Gauge:" + ga);
        }
    }
    private void isValidLength(double len) throws IllegalFastener{
        if(!(len == 2
                || len == 2.5
                || len == 3
                || len == 3.25
                || len == 6)){
            throw new IllegalFastener("Illegal Length:" + len);
        }
    }
    private void isValidSize(String sz) throws IllegalFastener{
        if(!(sz.equalsIgnoreCase("6D")
                || sz.equalsIgnoreCase("8D")
                || sz.equalsIgnoreCase("10D")
                || sz.equalsIgnoreCase("12D")
                || sz.equalsIgnoreCase("16D")
                || sz.equalsIgnoreCase("60D"))){
            throw new IllegalFastener("Illegal Size:" + sz );
        }
    }
    @Override
    public void isValidFinish(String fin, String mat) throws IllegalFastener{
        if(!(fin.equalsIgnoreCase("Bright")
                || fin.equalsIgnoreCase("Hot Dipped Galvanized"))){
            throw new IllegalFastener("Illegal Finish for Nails:" +fin);
        }
    }
    @Override
    public void isValidMaterial(String mat) throws IllegalFastener{
        if(!mat.equalsIgnoreCase("Steel")){
            throw new IllegalFastener("Illegal Material:" + mat);
        }
    }
    @Override
    public String toString(){
       return "Common Nail, " + size + " size, " + length + "\" long, " + gauge + "gauge" + super.toString();
    }

}
