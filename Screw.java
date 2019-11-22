import java.io.Serializable;

public abstract class Screw extends OuterThreaded implements Serializable {

    private static final long serialVersionUID = -7626666098690963100L;

    private String drive;
    private String head;

    public Screw (double len, String diam, String mat, String fin, String hd, String dr, double unitP, int npu) throws IllegalFastener{
        super(len,diam,mat,fin,unitP,npu);
        isValidDrive(drive);
        drive = dr;
        isValidHead(head);
        head = hd;

    }
    public void isValidDrive(String dr) throws IllegalFastener{
        if(!(dr.equalsIgnoreCase("6-Lobe")
                || dr.equalsIgnoreCase("Philips")
                || dr.equalsIgnoreCase("Slotted")
                || dr.equalsIgnoreCase("Square"))){
            throw new IllegalFastener("Illegal Drive:" + dr);
        }
    }
    public void isValidHead(String hd) throws IllegalFastener{
        if(!(hd.equalsIgnoreCase("Bugle")
                || hd.equalsIgnoreCase("Flat")
                || hd.equalsIgnoreCase("Oval")
                || hd.equalsIgnoreCase("Pan")
                || hd.equalsIgnoreCase("Round"))){
            throw new IllegalFastener("Illegal Head:" + hd);
        }
    }
    @Override
    public void isValidFinish(String fin, String mat) throws IllegalFastener{
        if(mat.equalsIgnoreCase("Steel")) {
            if (!(fin.equalsIgnoreCase("Chrome")
                    || fin.equalsIgnoreCase("Hot Dipped Galvanized")
                    || fin.equalsIgnoreCase("Plain")
                    || fin.equalsIgnoreCase("Yellow Zinc")
                    || fin.equalsIgnoreCase("Zinc")
                    || fin.equalsIgnoreCase("Black Phosphate")
                    || fin.equalsIgnoreCase("ACQ 1000 Hour")
                    || fin.equalsIgnoreCase("Lubricated"))) {
                throw new IllegalFastener("Illegal Finish:" + fin);
            }
        }
            if(mat.equalsIgnoreCase("StainlessSteel") || mat.equalsIgnoreCase("Brass")){
                if(!(fin.equalsIgnoreCase("Plain"))){
                    throw new IllegalFastener("Illegal Finish for Material:" +fin);
            }
        }
    }
    public String toString(){
        return  ", " + head + " head, " + drive + " drive" + super.toString();
    }

}
