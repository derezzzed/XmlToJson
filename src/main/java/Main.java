import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String fileName = "Students.xml";
        XmlAndJsonConverter converter = new XmlAndJsonConverter();

        try {

            List<Student> students = converter.deserializeFromXml(fileName);
            converter.serializeToJson(students);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
