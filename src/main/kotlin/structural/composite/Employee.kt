package structural.composite

class Employee(var name: String, var salary: Double) : EmployeeComponent {
    override fun getNetSalary(): Double {
        return salary
    }
}