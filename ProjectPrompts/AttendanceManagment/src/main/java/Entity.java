import java.util.UUID;

public class Entity {

    private String name;
    private UUID id;
    private int daysIn, daysOut;



    public Entity(String name, int daysIn, int daysOut) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.daysIn = daysIn;
        this.daysOut = daysOut;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getDaysIn() {
        return daysIn;
    }

    public void setDaysIn(int daysIn) {
        this.daysIn = daysIn;
    }

    public int getDaysOut() {
        return daysOut;
    }

    public void setDaysOut(int daysOut) {
        this.daysOut = daysOut;
    }

    @Override
    public String toString() {
        String shortId = id.toString().substring(0, 4);//Shorten the ID to the first 4 characters
        return "Id number:"+shortId+": "+ name+ ", Days in and out: " +daysIn + "/5 " + daysOut + "/5";
    }
}
