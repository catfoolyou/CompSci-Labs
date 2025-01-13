public class Volcano{

    private String name;
    private int height;
    private String continent;

    public Volcano(String n, int h, String c){
        this.name = n;
        this.height = h;
        this.continent = c;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }

    public String getContinent(){
        return this.continent;
    }

    public String toString(){
        return "Volcano " + this.name + " is located in " + this.continent + " and is " + this.height + " feet tall" ;
    }
}
