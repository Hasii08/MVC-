public class Main {
    public static void main(String[] args) {

        Employee model = new Employee();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        // For data used by the model
        model.createEmployee("0048", "Abdul", "Haseeb", "Male", "14/01/19", 200000);
        model.createEmployee("0049", "Danyal", "Nasir", "Male", "18/01/19", 500000);
        model.createEmployee("0069", "Mujataba", "Jafri", "Male", "25/01/19", 250000);

        controller.updateViewAll();

        controller.updateView(1);

        controller.deleteEmployee(1);



    }

}