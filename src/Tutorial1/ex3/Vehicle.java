package Tutorial1.ex3;
public class Vehicle {
    String name;
    Double width;
    Double height;
    Double length;
    Double weight;
    Integer seatingCapacity;
    String registrationNumber;
    Integer MAXLENGTH = 100;
    Double MIN = 0.0;
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("s", 0.1, 1.4, 4.5, 1200.0, 5);

        // test
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Width: " + vehicle.getWidth() + " meters");
        System.out.println("Height: " + vehicle.getHeight() + " meters");
        System.out.println("Length: " + vehicle.getLength() + " meters");
        System.out.println("Weight: " + vehicle.getWeight() + " kg");
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println(vehicle);

    }

    public Vehicle() {
    }

    public Vehicle(String name, Double width, Double height, Double length, Double weight, Integer seatingCapacity) {

        if (!ValidateName(name)) {
            throw new IllegalArgumentException("Name cannot be null, empty, or exceed " + MAXLENGTH + " characters.");
        }
        this.name = name;
        if(!ValidateWidth(width)) {
            throw new IllegalArgumentException("width cannot be null, empty, must be more or equal than " + width);
        }
        this.width = width;

        if (!validateHeight(height)) {
            throw new IllegalArgumentException("Height must be greater than" + MIN);
        }
        this.height = height;

        if (!validateLength(length)) {
            System.out.println("length is " + length);
            throw new IllegalArgumentException("Length must be greater than " + MIN);
        }
        this.length = length;

        if (!validateWeight(weight)) {
            throw new IllegalArgumentException("Weight must be greater than " + MIN);
        }
        this.weight = weight;

        if (!validateSeatingCapacity(seatingCapacity)) {
            throw new IllegalArgumentException("Seating capacity must be greater than 0.");
        }
        this.seatingCapacity = seatingCapacity;
    }

    public boolean ValidateName(String name){
        if (name == null || name.isEmpty()) {
            return false;
        }
        return name.length() <= MAXLENGTH;
    }

    public boolean ValidateWidth(Double Width) {
        return Width >= MIN;
    }

    public boolean validateHeight(Double height) {
        return height > MIN;
    }

    public boolean validateLength(Double length) {
        return length >= MIN;
    }

    public boolean validateWeight(Double weight) {
        return weight >= MIN;
    }

    public boolean validateSeatingCapacity(Integer seatingCapacity) {
        return seatingCapacity > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if (width <= 0) {
            System.out.println("width  must be 0+");
        } else {
            this.width = width;
        }

    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (height <= 0) {
            System.out.println("height  must be 0+");
        } else {
            this.height = height;
        }
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        if (length <= 0) {
            System.out.println("length  must be 0+");
        } else {
            this.length = length;

        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {

        if (weight <= 0) {
            System.out.println("weight must be 0+");
        } else {
            this.weight = weight;
        }
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        if (seatingCapacity <= 0) {
            System.out.println("seatingCapacity must be 0+");
        } else {
            this.seatingCapacity = seatingCapacity;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.matches("^[A-Z0-9]{1,12}$")) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException("Invalid registration number format");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                ", seatingCapacity=" + seatingCapacity +
                ", MAXLENGTH=" + MAXLENGTH +
                '}';
    }
}
