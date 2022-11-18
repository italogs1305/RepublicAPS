public class VariableExpense extends Expense{
    private byte priority;

    public void registerExpense(String name, String description, float value, byte priority) {
        this.name = name;
        nameList.add(name);
        
        this.value = value;
        valueList.add(value);

        this.description = description;
        nameList.add(description);
        
        this.priority = priority;
    }
}
