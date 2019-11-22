import java.io.Serializable;

public abstract class OuterThreaded extends Threaded implements Serializable {

    private static final long serialVersionUID = 5052531554883382962L;

    private double length;

    public OuterThreaded(double len, String diam, String mat, String fin, double unitP, int npu) throws IllegalFastener {
        super(diam, mat, fin, unitP, npu);
        isValidLength(len);
        length = len;
    }

    public static void isValidLength(double len) throws IllegalFastener {
    if(len >= 0.5 && len <= 6.00){
        if(!(len % 0.25 == 0)){
            throw new IllegalFastener("Illegal Length:" + len);
        }
    }
    else if(len >= 6.00 && len <= 11.00){
        if(!(len % 0.5 == 0)){
            throw new IllegalFastener("Illegal Length:" + len);
        }
    }
    else if(len >= 11.00 && len <= 20.00){
        if(!(len % 1.0 == 0)){
            throw new IllegalFastener("Illegal Length:" + len);
            }
        }
    else throw new IllegalFastener("Illegal Length:" + len);
    }
    @Override
    public abstract void isValidFinish(String fin, String mat) throws IllegalFastener;

    @Override
    public String toString() {
       return ", " + length + "\" long" + super.toString();
    }
}
