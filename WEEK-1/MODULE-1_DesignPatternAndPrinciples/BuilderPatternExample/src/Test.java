public class Test {
    public static void main(String[] args) {
        Computer computer =
                new Computer.ComputerBuilder()
                        .setCPU("ARM")
                        .setRAM(16)
                        .setStorage(512)
                        .setOS("Linux")
                        .build();
        System.out.println(computer);
    }
}
