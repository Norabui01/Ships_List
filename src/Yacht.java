public class Yacht extends Ship{
    private int numStateRooms;
    private int poolSize;
    private int numDecks;
    private int power;

    public Yacht(int nsr, int pSiz, int numDec, int pow, String nam,
                 String nat,  int yer, int len, int dra, int bem){
        super(nam, nat, yer, len, dra, bem);
        numStateRooms = nsr;
        poolSize = pSiz;
        numDecks = numDec;
        power = pow;

    }

    public int getNumStateRooms() {
        return numStateRooms;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public int getNumDecks() {
        return numDecks;
    }

    public int getPower() {
        return power;
    }

    public void setNumStateRooms(int numStateRooms) {
        this.numStateRooms = numStateRooms;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public void setNumDecks(int numDecks) {
        this.numDecks = numDecks;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + ", stateRooms: " + numStateRooms + ", poolSize: " + poolSize
                + ", numDecks: " + numDecks + ", maxPower: " + power;
    }
}
