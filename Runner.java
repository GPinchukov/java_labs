import by.gsu.pms.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Product[] products_list = products_list();        
                
                System.out.println("----------a)Вывести список товаров для заданного наименования.");
                System.out.print("Введите наименование продукта:");
                String name = scanner.next();
                Methods.product_check_name(products_list,name);

                System.out.println("----------b)Вывести список товаров для заданного наименования, цена которых не превосходит заданную.");
                System.out.print("Введите наименование продукта: ");
                name = scanner.next();
                System.out.print("Введите цену: ");
                Methods.product_check_name_and_price(products_list,name,scanner.nextInt());

                System.out.println("----------c)Вывести список товаров, срок хранения которых больше заданного.");
                System.out.print("Введите срок хранения: ");
                Methods.product_check_shelf_life(products_list,scanner.nextInt());
}