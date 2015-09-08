public class FortyLiters implements iGasTank{
    private float gasLevel;
    private final int MAX_GAS_LEVEL = 40;

    @Override
    public float getGasLevel(){
        return gasLevel;
    }

    @Override
    public int getTankCapacity(){
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGass(float liters){
        float total;
        if(getGasLevel() < getTankCapacity())
            total = get
    }
    
}