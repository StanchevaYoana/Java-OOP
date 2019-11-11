package CollectionHierarchy;

public class AddCollection extends Collection implements Addable{


    @Override
    public int add(String str) {
        super.getItems().add(0,str);
        return 0;
    }
}
