public class FixedExpense extends Expense {
    private String payday;
    
    public void registerExpense(String name, String description, float value, String payday) {
        this.name = name;
        nameList.add(name);
        
        this.value = value;
        valueList.add(value);

        this.description = description;
        descriptionList.add(description);

        this.payday = payday;
    }
}