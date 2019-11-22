import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {

    private static final long serialVersionUID = -7872680684643885615L;

    public CarriageBolt(double len, String diam, String mat, String fin, double unitP, int npu) throws IllegalFastener{
        super(len,diam,mat,fin,unitP, npu);
    }

    @Override
    public void isValidFinish(String fin, String mat) throws IllegalFastener{
        if(mat.equalsIgnoreCase("Steel")){
            if(!(fin.equalsIgnoreCase("Hot Dipped Galvanized")
                    || fin.equalsIgnoreCase("Chrome")
                    || fin.equalsIgnoreCase("Plain")
                    || fin.equalsIgnoreCase("Yellow Zinc")
                    || fin.equalsIgnoreCase("Zinc"))){
                throw new IllegalFastener("Illegal Pair of Material and Finish");
            }
        }
        if(mat.equalsIgnoreCase("Brass") || mat.equalsIgnoreCase("Stainless Steel")){
            if(!(fin.equalsIgnoreCase("Plain"))){
                throw new IllegalFastener("Illegal Finish:" + fin);
            }
        }
    }
    @Override
    public String toString(){
        return "Carriage Bolt" + super.toString();
    }
}
