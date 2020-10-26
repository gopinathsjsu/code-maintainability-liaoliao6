public class MyMainClass {
    public static void main(String[] args) {
        MachineFactory machineFactory = new MachineFactory();

        Machine machine1 = machineFactory.getMachine("ONE");
        System.out.println(machine1);
        machine1.insertCoin(25);
        machine1.turnCrank();
        machine1.insertCoin(10);
        machine1.turnCrank();
        machine1.insertCoin(25);
        machine1.turnCrank();
        machine1.insertCoin(25);
        machine1.turnCrank();

        Machine machine2 = machineFactory.getMachine("TWO");
        System.out.println(machine2);
        machine2.insertCoin(10);
        machine2.turnCrank();
        machine2.insertCoin(25);
        machine2.turnCrank();
        machine2.insertCoin(25);
        machine2.turnCrank();
        machine2.insertCoin(25);
        machine2.turnCrank();

        Machine machine3 = machineFactory.getMachine("THREE");
        System.out.println(machine3);
        machine3.insertCoin(1);
        machine3.turnCrank();
        machine3.insertCoin(5);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(10);
        machine3.turnCrank();
        machine3.insertCoin(25);
        machine3.turnCrank();
    }
}
