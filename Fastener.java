import java.io.Serializable;


public abstract class Fastener implements Serializable {

    private static final long serialVersionUID = 362137599137221300L;

    private String material;
    private String finish;
    private double unitPrice;
    private int numberPerUnit;

    public Fastener(String mat, String fin, double unitP, int npu) throws IllegalFastener{
        isValidMaterial(mat);
        material=mat;
        isValidFinish(fin,mat);
        finish=fin;
        isValidUnitPrice(unitP);
        unitPrice = unitP;
        isValidNumberPerUnit(npu);
        numberPerUnit = npu;
    }
    public void isValidMaterial(String mat) throws IllegalFastener{
        if(!(mat.equalsIgnoreCase("Brass")
                || mat.equalsIgnoreCase("Stainless Steel")
                || mat.equalsIgnoreCase("Steel"))){
            throw new IllegalFastener("Illegal Material:" +mat);
        }
    }
    public void isValidFinish(String fin, String mat) throws IllegalFastener{
        if(material.equalsIgnoreCase("Steel")){
            if (!(fin.equalsIgnoreCase("Chrome")
                    || fin.equalsIgnoreCase("Hot Dipped Galvanized")
                    || fin.equalsIgnoreCase("Plain")
                    || fin.equalsIgnoreCase("Yellow Zinc")
                    || fin.equalsIgnoreCase("Zinc"))) {
                throw new IllegalFastener("Illegal Finish:" + fin);
            }
        }
        if(material.equalsIgnoreCase("Brass")
                || material.equalsIgnoreCase("Stainless  Steel")){
            if(!(fin.equalsIgnoreCase("Plain"))){
                throw new IllegalFastener("Illegal Finish:" + fin);
            }
        }
    }
    public void isValidUnitPrice(double unitP) throws IllegalFastener{
        if(unitP < 0){
            throw new IllegalFastener("Illegal Unit Price:" + unitP);
        }
    }
    public void isValidNumberPerUnit(int npu) throws IllegalFastener {
        if (!(npu >= 1 && npu <= 10000)) {
            if(!((npu % 5) == 0)){
            throw new IllegalFastener("Illegal Number Per Unit:" + npu);
            }
        }
    }
    public double getOrderCost(int orderSize){
        return  unitPrice * orderSize;
    }

    @Override
    public String toString(){
         return ", " + material + ", with a " + finish + " finish. " + numberPerUnit + " in a unit, $" + unitPrice + " per unit.";
    }
}



