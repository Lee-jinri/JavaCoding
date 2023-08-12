package basic;

class Triangle {
    double bottom;
    double height;
    
    public Triangle(double bt, double hg) {
        bottom = bt;
        height = hg;
    }
      
    public void setBottom(double bt) {
        bottom = bt;
    }
    
    public void setHeight(double hg) {
        height = hg;
    }
    
    public double getArea() {
        return bottom * height / 2;
    }
}


