package Tutorial1.ex3;
public class Car extends Vehicle {
    public static final double MIN_CAR_WEIGHT = 1000.0;
    public static final double MAX_CAR_WEIGHT = 2000.0;
    public static final double MIN_CAR_LENGTH = 1.5;
    public static final double MAX_CAR_LENGTH = 3.5;

    public Car() {
        super();
    }

    public Car(String name, Double width, Double height, Double length, Double weight, Integer seatingCapacity) {
        super(name, width, height, length, weight, seatingCapacity);

        if (!validateWeight(weight)) {
            throw new IllegalArgumentException("Weight must be in the range [" + MIN_CAR_WEIGHT + ", " + MAX_CAR_WEIGHT + "] kgs.");
        }
        this.weight = weight;

        if (!validateLength(length)) {
            throw new IllegalArgumentException("length must be in the range [" + MIN_CAR_LENGTH + ", " + MAX_CAR_LENGTH + "] kgs.");
        }
        this.length = length;
    }

    @Override
    public boolean validateWeight(Double weight) {
        return weight >= MIN_CAR_WEIGHT && weight <= MAX_CAR_WEIGHT;
    }

    @Override
    public boolean validateLength(Double length) {
        return length >= MIN_CAR_LENGTH && length <= MAX_CAR_LENGTH;
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.matches("^[A-Z0-9]{1,6}$")) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException("Invalid Car registration number format");
        }
    }


    public static void main(String[] args) {
//        try {
//            Car car = new Car("CarModel", 2.5, 3.5, 12.0, 1500.0, 50);
//            System.out.println(car);
//        } catch(IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        Car car = new Car();
        try {
            car.setWeight(1500.0);
            car.setLength(2.5);
            car.setRegistrationNumber("CAR123");
            System.out.println("\nCar created successfully");
            System.out.println(car.toString());
            System.out.println("Registration number: " + car.getRegistrationNumber());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating car: " + e.getMessage());
        }
    }
}
