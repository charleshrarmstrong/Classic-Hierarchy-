import java.io.Serializable;

public abstract class Threaded extends Fastener implements Serializable {

    private static final long serialVersionUID = 7945416784876515861L;

    private String diameter;

    public Threaded(String diam, String mat, String fin, double unitP, int npu) throws IllegalFastener {
        super(mat,fin,unitP,npu);
        isValidDiameter(diam);
        diameter = diam;
    }
    public void isValidDiameter(String diam) throws IllegalFastener{
        if(!(diam.equalsIgnoreCase("#8-13")
                || diam.equalsIgnoreCase("#8-15")
                || diam.equalsIgnoreCase("#8-32")
                || diam.equalsIgnoreCase("#10-13")
                || diam.equalsIgnoreCase("#10-24")
                || diam.equalsIgnoreCase("#10-32")
                || diam.equalsIgnoreCase("1/4\"-20")
                || diam.equalsIgnoreCase("5/16\"-18")
                || diam.equalsIgnoreCase("3/8\"-16")
                || diam.equalsIgnoreCase("7/16\"-14")
                || diam.equalsIgnoreCase("1/2\"-13")
                || diam.equalsIgnoreCase("5/8\"-11")
                || diam.equalsIgnoreCase("3/4\"-10"))){
            throw new IllegalFastener("Illegal Diameter:" + diam);
        }
    }
    public abstract void isValidFinish(String fin, String mat) throws IllegalFastener;

    @Override
    public String toString(){
        return ", " + diameter + "thread" + super.toString();
    }
}