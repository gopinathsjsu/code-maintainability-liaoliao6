public class MachineFactory {
    public Machine getMachine(String machineNumber) {
        if(machineNumber == null) {
            return null;
        }
        if(machineNumber.equalsIgnoreCase("ONE")) {
            return new GumballMachineOne(2);
        }
        if(machineNumber.equalsIgnoreCase("TWO")) {
            return new GumballMachineTwo(2);
        }
        if(machineNumber.equalsIgnoreCase("THREE")) {
            return new GumballMachineThree(2);
        }

        return null;
    }
}
