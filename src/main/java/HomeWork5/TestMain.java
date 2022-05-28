package HomeWork5;

public class TestMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee ("Tikhomirov Maxim Lvovich", "System Administrator", "Tikhomirov33@mail.ru", "80292604445", 2500, 49),
                new Employee ("Punevich Maria Dmitrievna","C++ / C programmer","Maria.pun@mail.ru","80336435875",4000,41),
                new Employee ("Alekhneichik Timofei Eldarovich","SQL/Oracle programmer","alekhneychik@mail.ru","80295632929",10255,40),
                new Employee ("Mikhalkov Mikhail Mikhailovich","PHP programmer","Mikhail1@mail.ru","80443891289",20510,41),
                new Employee ("Demidov Petr Dmitrievich","web designer","DemidovPetr.49@mail.ru","80293982030",2000,49)

        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40 ) {
                employee.print();
            }
            
        }
    }
}
