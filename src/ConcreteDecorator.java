// Concrete Decorator class
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("ConcreteDecorator operation.");
    }
}