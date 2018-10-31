import java.io.FileOutputStream;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;

import com.sun.xml.internal.ws.util.Pool.Marshaller;

public class StudentMarshaller {
    public static void main(String[] args) {
        
        try {
            // Create JAXB Context
            JAXBContext context = JAXBContext.newInstance(Student.class);

            // Create Marshaller object 
            Marshaller marshaller = context.createMarshaller();

            // Setting property to show xml format
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Setting the values in the POJO
            Student student = new Student("James", 5325, "JAVA");

            //Calling the marshaller method 
            marshaller.marshal(student, new FileOutputStream("~/ThursdayJavaStuff/student.xml"));
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}