class Employee {
    int empID;
    int deptID;

    public Employee(int empID, int deptID) {
        this.empID = empID;
        this.deptID = deptID;
    }

    public double calculateLeaveAmount(int noOfDays) {
        return 0;
    }
}

class Worker extends Employee {
    public Worker(int empID, int deptID) {
        super(empID, deptID);
    }

    @Override
    public double calculateLeaveAmount(int noOfDays) {
        return 500 * noOfDays;
    }
}

class Manager extends Employee {
    public Manager(int empID, int deptID) {
        super(empID, deptID);
    }

    @Override
    public double calculateLeaveAmount(int noOfDays) {
        return 400 * Math.ceil(noOfDays / 2.0);
    }
}

class Other extends Employee {
    public Other(int empID, int deptID) {
        super(empID, deptID);
    }

    @Override
    public double calculateLeaveAmount(int noOfDays) {
        return 600 * noOfDays;
    }
}

public class LeaveCalculator {
    public static void main(String[] args) {
        Worker worker = new Worker(101, 1);
        double leaveAmount = worker.calculateLeaveAmount(7);
        System.out.println("Leave amount for worker: Rs " + leaveAmount);

        Manager manager = new Manager(102, 2);
        leaveAmount = manager.calculateLeaveAmount(4);
        System.out.println("Leave amount for manager: Rs " + leaveAmount);

        Other other = new Other(103, 3);
        leaveAmount = other.calculateLeaveAmount(10);
        System.out.println("Leave amount for other employee: Rs " + leaveAmount);
    }
}