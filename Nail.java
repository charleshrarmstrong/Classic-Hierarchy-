import java.io.Serializable;

public abstract class Nail extends Fastener implements Serializable {

    private static final long serialVersionUID = -6564907317925322266L;

    public Nail(String fin, double unitP, int npu) throws IllegalFastener {
        super("Steel",fin,unitP,npu);
    }
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    public abstract void isValidFinish(String fin, String mat) throws IllegalFastener;
}
