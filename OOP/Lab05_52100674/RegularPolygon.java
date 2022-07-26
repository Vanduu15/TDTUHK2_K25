class RegularPolygon{
    private String name;
    private int egdeAmount;
    private double egdeLength;

    public RegularPolygon(){
        name  = "";
        egdeAmount = 3;
        egdeLength = 1;
    }

    public RegularPolygon(String name, int egdeAmount, double egdeLength){
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }

    public RegularPolygon(String name, int egdeAmount){
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon){
        this.name = polygon.name;
        this.egdeAmount = polygon.egdeAmount;
        this.egdeLength = polygon.egdeLength;
    }

    public String getName(){
        return this.name;
    }

    public int getEdgeAmount(){
        return this.egdeAmount;
    }

    public double getEdgeLength(){
        return this.egdeLength;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEdgeAmount(int num){
        egdeAmount = num;
    }

    public void setEdgeLength(double length){
        egdeLength = length;
    }

    public String getPolygon(){
        if (egdeAmount == 3 ) return "Polygon";
        if (egdeAmount == 4 ) return "Quadrangle";
        if (egdeAmount == 5 ) return "Pentagon";
        if (egdeAmount == 6 ) return "Hexagon";
        if (egdeAmount > 6 ) return "Polygon has the number of edges greater than 6";
        return "Check Edge Amount";
        
    }

    public double getPerimeter(){
        return egdeLength * egdeAmount;
    }

    public double getArea(){
        if (egdeAmount == 3 ) return egdeLength * egdeLength * 0.433;
        if (egdeAmount == 4 ) return egdeLength * egdeLength;
        if (egdeAmount == 5 ) return egdeLength * egdeLength * 1.72;
        if (egdeAmount == 6 ) return egdeLength * egdeLength * 2.595;
        if (egdeAmount > 6 ) return -1;
        return -2;
    }

    public String toString(){
        return name + " - " + getPolygon() + " - " + getArea();
    }
}