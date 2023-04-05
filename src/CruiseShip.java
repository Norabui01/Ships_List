public class CruiseShip extends Ship{
    private int numExecutiveStateRooms;
    private int numDoubleBunkRooms;
    private int numQuadBunkRooms;
    public CruiseShip(int numExRooms, int numDoubleRooms, int numQuadRooms,
                      String nam,  String nat,  int yer, int len, int dra, int bem){
        super(nam, nat, yer, len, dra, bem);
        numExecutiveStateRooms = numExRooms;
        numDoubleBunkRooms = numDoubleRooms;
        numQuadBunkRooms = numQuadRooms;

    }

    public int getNumExecutiveStateRooms() {
        return numExecutiveStateRooms;
    }

    public void setNumExecutiveStateRooms(int numExecutiveStateRooms) {
        this.numExecutiveStateRooms = numExecutiveStateRooms;
    }

    public int getNumDoubleBunkRooms() {
        return numDoubleBunkRooms;
    }

    public void setNumDoubleBunkRooms(int numDoubleBunkRooms) {
        this.numDoubleBunkRooms = numDoubleBunkRooms;
    }

    public int getNumQuadBunkRooms() {
        return numQuadBunkRooms;
    }

    public void setNumQuadBunkRooms(int numQuadBunkRooms) {
        this.numQuadBunkRooms = numQuadBunkRooms;
    }

    @Override
    public String toString() {
        return super.toString() + ", ExeRms: " + numExecutiveStateRooms + ", Double rms: " + numDoubleBunkRooms
                + ", Quad rms" + numQuadBunkRooms;
    }
}
