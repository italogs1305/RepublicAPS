public class VariableExpense extends Expense{
    private byte priority;

    public void registerExpense(String name, String description, float value, byte priority) {
        this.name = name;
        this.value = value;
        this.priority = priority;
        this.description = description;
    }
}
