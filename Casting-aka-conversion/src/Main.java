
public class Main {
    public static void main(String[] args) {
        //sometimes you do need to convert between data types outside of just input conversion

        //This program calculates a percentage score based on the maximum score you can get...
        //i.e. if there are 100 points in a game and you get a 10 that is 10 percent
        int maxScore = 100;
        int myscore = 20;
        //calculating percentages in integers is not allowed..we have to do some conversion
        float percentage = (float) myscore / maxScore * 100.0f;
        System.out.println(percentage);
    }
}