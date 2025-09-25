package Unit_01;

public class Day_02_0f_exception {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try {
            udf.validates(13);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
