public class FixedExpense extends Expense {
    
    public void registerExpense(String name, String description, float value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }
}