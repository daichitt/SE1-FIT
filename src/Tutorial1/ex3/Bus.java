package Tutorial1.ex3;
public class Bus extends Vehicle {
    public static final double MIN_BUS_WEIGHT = 5000.0;
    public static final double MAX_BUS_WEIGHT = 20000.0;
    public static final double MIN_BUS_LENGTH = 4.0;
    public static final double MAX_BUS_LENGTH = 10.0;

    public Bus() {
        super();
    }
    // Bus
    public Bus(String name, Double width, Double height, Double length, Double weight, Integer seatingCapacity) {
        super(name, width, height, length, weight, seatingCapacity);
        this.name = name;
        this.width = width;
        this.height = height;
        if (!validateWeight(weight)) {
            throw new IllegalArgumentException("Weight must be in the range [" + MIN_BUS_WEIGHT + ", " + MAX_BUS_WEIGHT  + "] kgs.");
        }
        this.weight = weight;

        if (!validateLength(length)) {
            throw new IllegalArgumentException("length must be in the range [" + MIN_BUS_LENGTH + ", " + MAX_BUS_LENGTH + "] meters.");
        }
        this.length = length;
    }

    @Override
    public boolean validateWeight(Double weight) {
        return weight >= MIN_BUS_WEIGHT && weight <= MAX_BUS_WEIGHT;
    }

    @Override
    public boolean validateLength(Double length) {
        System.out.println("length" + length);
        return length >= MIN_BUS_LENGTH && length <= MAX_BUS_LENGTH;
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.matches("^[A-Z0-9]{1,8}$")) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException("Invalid Bus registration number format");
        }
    }
    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", MAXLENGTH=" + MAXLENGTH +
                ", MIN=" + MIN +
                '}';
    }

    public static void main(String[] args) {
        // Test Bus
        Bus bus = new Bus();
        try {
            bus.setWeight(10000.0);
            bus.setLength(8.5);
            bus.setName("Bus 1");
            bus.setWeight(111.0);
            bus.setRegistrationNumber("BUS12345");
            System.out.println(bus.toString());

            System.out.println("Registration number: " + bus.getRegistrationNumber());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating bus: " + e.getMessage());
        }
    }
}
