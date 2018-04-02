package structural.composite

class PyramidComposite(var name: String) : EmployeeComponent {

    var employeeList = ArrayList<EmployeeComponent>()

    override fun getNetSalary(): Double {
        var salary = 0.0
        for(employee in employeeList) salary += employee.getNetSalary()
        return salary
    }

    fun add(employee: EmployeeComponent) {
        employeeList.add(employee)
    }

    fun remove(employee: EmployeeComponent) {
        employeeList.remove(employee)
    }
}