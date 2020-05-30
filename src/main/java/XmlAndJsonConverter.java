import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

class XmlAndJsonConverter {

    XmlAndJsonConverter() {
    }

    List<Student> deserializeFromXml(String fileName) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();

        CollectionType type = xmlMapper
                .getTypeFactory()
                .constructCollectionType(List.class, Student.class);

        return xmlMapper.readValue(new File(fileName), type);
    }

    void serializeToJson(List<Student> studentList) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        objectMapper.writeValue(new File("studentsJson.json"), studentList);
    }
}