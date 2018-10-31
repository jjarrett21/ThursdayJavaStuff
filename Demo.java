import java.io.*;

class Demo implements java.io.Serializable {
    public int a;
    public String b;

    // Constructor 
    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

    class Test {
        public static void main(String[] args) {

            Demo object = new Demo(1, "geeksforgeeks");
            String filename = "file.ser";

            // Serialization 
            try {
                // Saving object in a file 
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                // Method for serialization of object
                out.writeObject(object);
                
                out.close();
                file.close();

                System.out.println("Object has been serialized");

            } catch (IOException e) {
                System.out.println("Exception caught");

            }

            Demo object2 = null;

            //Deserialization 
            try {
                
                // Reading the obejct from a file 
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method Deserialization 
                object2 = (Demo)in.readObject();

                in.close();
                file.close();

                System.out.println("Object has been deserialized ");
                System.out.println("a = " + object2.a);
                System.out.println("b = " + object2.b);

            } catch (Exception e) {
                System.out.println("IOExcpetion is caught");            
        }
    }
}