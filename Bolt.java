import java.io.Serializable;

public abstract class Bolt extends OuterThreaded implements Serializable {

  private static final long serialVersionUID = 2697103467129280849L;


  public Bolt(double len, String diam, String mat, String fin, double unitP, int npu) throws IllegalFastener{
      super(len,diam,mat,fin,unitP,npu);
  }

  @Override
    public abstract void isValidFinish(String fin, String mat) throws IllegalFastener;

  @Override
    public String toString(){
      return super.toString();
  }
}
