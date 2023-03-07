public class Main {
    public static void main(String[] args) {
        // Create a ConcreteComponent object
        Component component = new ConcreteComponent();
        component.operation(); // Output: "ConcreteComponent operation."

        // Decorate the ConcreteComponent object with a ConcreteDecorator object
        Component decorator = new ConcreteDecorator(component);
        decorator.operation(); // Output: "ConcreteComponent operation.", "ConcreteDecorator operation."
    }
}