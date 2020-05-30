import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = " Student")
public class Student {

    @JacksonXmlProperty(localName = "name")
    private String name;

    @JacksonXmlProperty(localName = "item")
    private String item;

    @JacksonXmlProperty(localName = "date")
    private String date;

    @JacksonXmlProperty(localName = "degree")
    private String degree;

    Student() {

    }

    Student(String name, String item, String date, String degree) {

        this.name = name;
        this.item = item;
        this.date = date;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }

    public String getDate() {
        return date;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return name + " " + item + " " + date + " " + degree;
    }}
