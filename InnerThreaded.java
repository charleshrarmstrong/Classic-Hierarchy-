import java.io.Serializable;

public abstract class InnerThreaded extends Threaded implements Serializable {

    private static final long serialVersionUID = 2633273163775943674L;

    public InnerThreaded(String diam, String mat, String fin, double unitP, int npu) throws IllegalFastener {
       super(diam,mat,fin,unitP,npu);
   }

    public abstract void isValidFinish(String fin, String mat) throws IllegalFastener;

    @Override
    public String toString(){
        return super.toString();
    }
}
