import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        IjonesWay way = new IjonesWay();
        IjonesPath path = new IjonesPath();
        way.ijonesWay();
        int height = way.getH();
        int width = way.getW();
        char[][] corridor = way.getCorridor();

        String fileName = "ijones.out";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Number of paths: " + path.getPathsNumber(corridor, height, width));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
