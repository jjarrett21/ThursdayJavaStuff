import java.util.Comparator;

public class Cars {
    private String make;
    private String model;
    private int year;

    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Comparator for sorting list by make
        public static Comparator<Cars> makeSort = new Comparator<Cars>() {
            public int compare(Cars c1, Cars c2) {
                String carMake1 = c1.getMake().toUpperCase();
                String carMake2 = c2.getMake().toUpperCase();

                // Ascending order
                return carMake1.compareTo(carMake2);
            
        }};

        // Sorting by Model 
        public static Comparator<Cars> modelSort = new Comparator<Cars>() {
            public int compare(Cars c1, Cars c2) {
                String carModel1 = c1.getModel().toUpperCase();
                String carModel2 = c2.getModel().toUpperCase();

                // Ascending Order
                return carModel1.compareTo(carModel2);
            
        }};

        // Sorting by year
        public static Comparator<Cars> yearSort = new Comparator<Cars>() {
          public int compare(Cars c1, Cars c2) {
                int carYear1 = c1.getYear();
                int carYear2 = c2.getYear();

                //Ascending order
                return carYear1-carYear2;
        }};

        @Override
        public String toString() {
            return "[ make=" + make + ", model=" + model + ", year=" + year + "]";
        }


    }

