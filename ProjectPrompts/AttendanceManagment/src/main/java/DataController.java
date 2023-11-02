import java.util.ArrayList;

public class DataController {


    ArrayList<Entity> peopleList = new ArrayList<>();

    public ArrayList<Entity> getPeopleList() {
        peopleList.add(new Entity("John", 3,  2));
        peopleList.add(new Entity("Jack",  4, 1));
        peopleList.add(new Entity("Jim", 1, 3));
        peopleList.add(new Entity("Jason", 0, 0));

        return peopleList;
    }

    public void viewList(ArrayList<Entity> list){
        for (Entity entity : list) {
            System.out.println(entity);
        }
    }

    public void addToList(Entity entity){
        ArrayList<Entity> addingList = getPeopleList();
        addingList.add(entity);
        viewList(addingList);
    }

    public void deleteFromList(){

    }

    public void editEntity(){

    }

}
