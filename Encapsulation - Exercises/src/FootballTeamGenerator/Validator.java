package FootballTeamGenerator;

public class Validator {

    public static void validateName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }
    public  static void  validatePlayerStars (String string, int star){
        if (star > 100 || star < 0){
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", string));
        }


    }
}
