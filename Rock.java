public class Rock{
   private String group, naturalColor, paintedColor;
   private double weight;
   public Rock(){
      group = "igneous";
      naturalColor = "brown";
      paintedColor = "none";
      weight = 0.5;
   }
   public Rock(String g, String n, String p, double w){
      group = g;
      naturalColor = n;
      paintedColor = p;
      weight = w;
   }
   public String getGroup(){
      return group;
   }

   public String getNaturalColor(){
      return naturalColor;
   }

   public String getPaintedColor(){
      return paintedColor;
   }

   public double getWeight(){
      return weight;
   }
   public void paint(String color){
      paintedColor = color;
   }

   public void breakOffHalf(){
      weight /= 2;
   }

   public void chiselAway(double removal){
      if (weight >= removal){
         weight -= removal;
      }
   }
     
   public Rock divide(){
      weight /= 2;
      return new Rock(group, naturalColor, paintedColor, weight);
   }
     
   public String toString(){
      return "Rock Group: " + group +
         "\nNatural Color: " + naturalColor +
         "\nPainted Color: " + paintedColor +
         "\nWeight: " + weight + " pounds\n\n";
   }
}