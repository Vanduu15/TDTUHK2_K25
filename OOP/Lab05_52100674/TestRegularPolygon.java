class TestRegularPolygon{
    public static void main(String[] args){
        RegularPolygon poly = new RegularPolygon();
        System.out.println(poly);

        RegularPolygon poly1 = new RegularPolygon("q1", 4);
        System.out.println(poly1);

        RegularPolygon poly2 = new RegularPolygon("q2", 5, 6);
        System.out.println(poly2);

        System.out.println("\npoly2.getName() + ' ' + poly2.getEdgeAmount() + ' ' + poly2.getEdgeLength() + ' ' + poly2.getPolygon() + ' ' + poly2.getPerimeter() + ' ' + poly2.getArea():");
        System.out.println(poly2.getName() + " " + poly2.getEdgeAmount() + " " + poly2.getEdgeLength() + " " + poly2.getPolygon() + " " + poly2.getPerimeter() + " " + poly2.getArea());

        poly2.setName("poly3");
        poly2.setEdgeAmount(6);
        poly2.setEdgeLength(10);
        System.out.println("\npoly2.setName('poly3'); poly2.setEdgeAmount(6); poly2.setEdgeLength(10);");
        System.out.println(poly2.getName() + " " + poly2.getEdgeAmount() + " " + poly2.getEdgeLength() + " " + poly2.getPolygon() + " " + poly2.getPerimeter() + " " + poly2.getArea());
    }
}