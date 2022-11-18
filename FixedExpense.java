public class FixedExpense extends Expense {
    
    public void registerExpense(String name, String description, float value) {
        this.name = name;
        nameList.add(name);
        
        this.value = value;
        valueList.add(value);

        this.description = description;
        descriptionList.add(description);
    }
}