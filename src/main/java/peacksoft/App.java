package peacksoft;

import peacksoft.model.Employee;
import peacksoft.servise.UserService;
import peacksoft.servise.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        UserService userService = new UserServiceImpl();
            //userService.createTable();

        Employee employee = new Employee("Mia", 23);

         userService.saveUser(employee);
        }
    }