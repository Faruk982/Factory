public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        if(shape1!=null)shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if(shape2!=null)shape2.draw();
        //System.out.printf("Hello and welcome!");
    }
}