import java.io.Serializable;

public class WoodScrew extends Screw implements Serializable{

    private static final long serialVersionUID = 6406373732568671889L;

    private String point;

    public WoodScrew(double len, String diam, String mat, String fin, String hd, String dr, String pt, double unitP, int npu) throws IllegalFastener{
        super(len,diam,mat,fin,hd,dr,unitP,npu);
        isValidPoint(pt);
        point = pt;
    }
    public void isValidPoint(String pt) throws IllegalFastener{
        if(!(pt.equalsIgnoreCase("Double Cut")
                || pt.equalsIgnoreCase("Sharp")
                || pt.equalsIgnoreCase("Type 17"))){
            throw new IllegalFastener("Illegal Point:" + pt);
        }
    }
    @Override
    public String toString(){
        return "Wood Screw, " + point + " point" +super.toString();
    }
}
