package WT_LAB.Lab11.General;

public class employee
{
    protected int empId;
    private String empName;

    public double earnings(double basic)
    {
        double earning = basic + (0.8 * basic) + (0.15 * basic); 
        return earning; 
    }
}
