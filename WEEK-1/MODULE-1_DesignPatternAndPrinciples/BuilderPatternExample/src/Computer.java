public class Computer {
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", OS='" + OS + '\'' +
                ", maxClockSpeed=" + maxClockSpeed +
                ", cpuArchitecture='" + cpuArchitecture + '\'' +
                ", dedicatedGraphicsCard=" + dedicatedGraphicsCard +
                '}';
    }

    String CPU;
    int RAM;
    int storage;
    String OS;
    int maxClockSpeed;
    String cpuArchitecture;
    boolean dedicatedGraphicsCard;

    private Computer(ComputerBuilder cb){
        this.CPU = cb.CPU;
        this.RAM = cb.RAM;
        this.storage = cb.storage;
        this.OS = cb.OS;
        this.maxClockSpeed = cb.maxClockSpeed;
        this.cpuArchitecture = cb.cpuArchitecture;
        this.dedicatedGraphicsCard = cb.dedicatedGraphicsCard;
    }
    static class ComputerBuilder{
        String CPU;
        int RAM;
        int storage;
        String OS;
        int maxClockSpeed;
        String cpuArchitecture;
        boolean dedicatedGraphicsCard;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public ComputerBuilder setMaxClockSpeed(int maxClockSpeed) {
            this.maxClockSpeed = maxClockSpeed;
            return this;
        }

        public ComputerBuilder setCpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        public ComputerBuilder setDedicatedGraphicsCard(boolean dedicatedGraphicsCard) {
            this.dedicatedGraphicsCard = dedicatedGraphicsCard;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
