
public abstract class Toy {
    private int id;
    private String name;
    private int weight;
    
    public Toy(int id, String name, int weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
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

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("ID игрушки: %d\n", id))
                .append(String.format("Название игрушки: %s\n", name))
                .append(String.format("Частота выпадения: %d", weight));
        return res.toString();
    }
}