class Employee {
    int salary = 60000;
}
class Engineer extends Employee {
    int benefits = 10000;
}
class Total {
    public static void main(String[] args) {
        Engineer s1 = new Engineer();
        System.out.println("Salary: "+ s1.salary + "\nbenefits:" + s1.benefits);
    }
}
