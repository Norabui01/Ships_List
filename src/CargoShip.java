public class CargoShip extends Ship{
    private int maxCargoTonnage;
    private int refStorage;

    public CargoShip(int maxTonnage, int refSto, String nam,  String nat,  int yer, int len, int dra, int bem){
        super(nam, nat, yer, len, dra, bem);
        maxCargoTonnage = maxTonnage;
        refStorage = refSto;

    }

    public int getMaxCargoTonnage() {
        return maxCargoTonnage;
    }

    public void setMaxCargoTonnage(int maxCargoTonnage) {
        this.maxCargoTonnage = maxCargoTonnage;
    }

    public int getRefStorage() {
        return refStorage;
    }

    public void setRefStorage(int refStorage) {
        this.refStorage = refStorage;
    }

    @Override
    public String toString() {
        return super.toString() + ", maxTons: " + maxCargoTonnage + ", reSpace: " + refStorage;
    }
}
