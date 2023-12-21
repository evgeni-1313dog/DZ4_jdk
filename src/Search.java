import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

   protected static List<Guide> sea = new ArrayList<>();


    public static void addSea(Guide newGuide) {
        sea.get(newGuide.getService_number());
    }
    public static List<Guide> getExp(int workExp) {
        return sea.stream().filter(element -> element.getExperience()== workExp).collect(Collectors.toList());
    }

    public static List<Integer> getPhoneByName(String name) {
        return sea.stream().filter((sea) -> (sea.getName().equals(name)))
                .map(Guide::getPhone).toList();

    }

    public static List<Guide> getService(int ID) {
        return sea.stream().filter(element -> element.getService_number()== ID).collect(Collectors.toList());
    }
}
