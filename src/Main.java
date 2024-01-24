public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        ShapeFactory shapeFactory2 =  ShapeFactory.getInstance();

        Shape shape1 = shapeFactory.getShape("Square");
        if(shape1!=null)shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if(shape2!=null)shape2.draw();
        System.out.println("Hashcode of 1 is "
                + shapeFactory.hashCode());
        System.out.println("Hashcode of 2 is "
                + shapeFactory2.hashCode());
        //System.out.printf("Hello and welcome!");
    }
}