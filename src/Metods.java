static Product[] products_list(){
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Введите количество товаров: ");
    Product[] products = new Product[scanner1.nextInt()];
    for (int i = 0; i < products.length; i++) {
        products[i] = new Product();
        System.out.println();
        System.out.print("Введите id: ");
        products[i].setId(scanner1.nextInt());
        System.out.print("Введите название товара: ");
        products[i].setName(scanner1.next());
        System.out.print("Введите UPC: ");
        products[i].setUPC(scanner1.nextInt());
        System.out.print("Введите производителя: ");
        products[i].setManufacturer(scanner1.next());
        System.out.print("Введите цену: ");
        products[i].setPrice(scanner1.nextDouble());
        System.out.print("Введите срок хранения: ");
        products[i].setShelf_life(scanner1.nextInt());
        System.out.print("Введите количестов: ");
        products[i].setNumber(scanner1.nextInt());
    }

    return products;

}

static Product[] prod(){
    Product[] products = new Product[4];

    products[0]=new Product(0,"Торт",1275,"Рошен",143.75,5,6);
    products[1]=new Product(1,"Торт",1276,"Рошен",212.50,5,2);
    products[2]=new Product(2,"Чай",2437,"Индия",38.45,120,32);
    products[3]=new Product(2,"Конфеты",2437,"Конти",29.5,60,86);

    return products;
}

static void product_check_name(Product[] products, String name){
    for (Product product : products) {
        if(product.getName().equals(name))
            System.out.println(product.toString());
    }
    System.out.println();
}

static void product_check_name_and_price(Product[] products, String name,double price){
    for (Product product : products) {
        if (product.getName().equals(name) && product.getPrice()<=price){
            System.out.println(product.toString());
        }
    }
    System.out.println();
}

static void product_check_shelf_life(Product[] products,int shelf_life){
    for (Product product : products) {
        if (product.getShelf_life()>shelf_life)
            System.out.println(product.toString());
    }
}