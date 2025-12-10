public class Vehicle {
    private int vehicleId;
    private String plateNumber;
    private String model;
    private String manufacturer;
    private int manufactureYear;
    private String vehicleType;

    private static int idCounter=1;

    public Vehicle(String plateNumber, String model, String manufacturer, int manufactureYear,
            String vehicleType) {

                if (manufactureYear < 1990) {
                    throw new IllegalArgumentException("Manufacture Year Must be >=1990");
                }
                if (manufacturer == null || manufacturer.isEmpty()) {
                    throw new IllegalArgumentException("Manufacturer can not be empty");
                }
                if (model == null || model.isEmpty()) {
                    throw new IllegalArgumentException("Model can not be empty");
                }
                if (!vehicleType.matches("Car|Truck|Motocycle|Bus")) {
                    throw new IllegalArgumentException("Invalid vehicle type");
                }


        this.vehicleId = idCounter;
        this.plateNumber = plateNumber;
        this.model = model;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;

        idCounter++;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

}
