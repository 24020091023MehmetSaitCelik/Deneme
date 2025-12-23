package tr.edu.istiklal;

public class GeometrictObject {

    private String renk="beyaz";
    private boolean doluluk;

    public GeometrictObject(){

    }
    public GeometrictObject(String renk,boolean doluluk){
        this.renk=renk;
        this.doluluk=doluluk;
    }
    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }
    public boolean getDoluluk(){
        return doluluk;
    }
    public void setDoluluk(boolean doluluk) {
        this.doluluk=doluluk;
    }
    public String toString() {
        return "Renk: " + renk + " ve doluluk: " + doluluk;
    }
}
