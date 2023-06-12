
public abstract class Toy {
    private int id;
    private String name;
    private int weight;
    private int quantity;
    
    public Toy(int id, String name, int weight, int quantity){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("ID игрушки: %d\n", id))
                .append(String.format("Название игрушки: %s\n", name))
                .append(String.format("Частота выпадения в процентах: %d\n", weight))
                .append(String.format("Доступное количество игрушек: %d\n", quantity));
        return res.toString();
    }
}