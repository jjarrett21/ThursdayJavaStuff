import javax.xml.bind.annotation.*;

import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
// Specifies the root element for the XML doc.
public class Student {

    private String name;
    private String subject;
    private int id;

    Student() {
        // Public Constructor 
    }

    Student(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    @XmlElement
    // Specifies a sub=element
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    // Specifes the attribute for the XML
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    } 
}