public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Square");shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");shape2.draw();
        System.out.printf("Hello and welcome!");
    }
}