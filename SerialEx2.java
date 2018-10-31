import java.io.*;

class Emp implements Serializable {
    private static final long serialVersionUID = 129348938L;

    transient int a;
    static int b;
    String name;
    int age;

    public Emp(String name, int age,  int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }
}

public class SerialEx2   {
    public static void printdate(Emp object1) {
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }


    public static void main(String[] args) throws Exception {
        Emp object = new Emp("james", 25, 2, 3);
        String filename = "somename.txt";
 
        try(FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file)) 
        {

                out.writeObject(object);
                System.out.println("Serialized object: " + out);
                printdate(object);
                RuntimeException re = new RuntimeException("Top Layer");
                re.initCause(new FileNotFoundEception("cause"));
                throw re;

        } catch(RuntimeException re) {
            //System.out.println(re.getCause());
            throw new RuntimeException();
        }

        object = null;

        // Deserialization
        try {
            
            // Reading the object from a file 

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object = (Emp)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized\n" + "Data fter Deserialization: ");
            printdate(object);

        } catch (Exception e) {
            System.out.println("Exception caught " + e);
        }
    }
}