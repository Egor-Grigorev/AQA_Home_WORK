package Lesson_2_3;

public class ArrayOfFiveProducts {
    public static void main(String[] args) {
        // Объявление массива продуктов
        Product[] productsArray = new Product[5];

        // Инициализация элементов массива объектами класса Product
        productsArray[0] = new Product("Молоко", "01.11.2025", "ЗАО 'АгроПром'", "Россия", 90, true);
        productsArray[1] = new Product("Кефир", "15.11.2025", "ЗАО 'АгроПром'", "Россия", 120, true);
        productsArray[2] = new Product("Ряженка", "20.11.2025", "ЗАО 'АгроПром'", "Россия", 122, true);
        productsArray[3] = new Product("Масло", "05.11.2025", "ЗАО 'АгроПром'", "Россия", 400, true);
        productsArray[4] = new Product("Сливки", "10.11.2025", "ЗАО 'АгроПром'", "Россия", 350, true);

        // Проходим по каждому элементу массива и выводим его информацию
        for (Product product : productsArray) {
            System.out.println(product.toString());
        }
    }
}

class Product {
    private String name;
    private String releaseDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean availableInStock;

    // Конструктор
    public Product(String name, String releaseDate, String manufacturer,
                   String countryOfOrigin, double price, boolean availableInStock) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.availableInStock = availableInStock;
    }

    // Метод toString(), возвращающий строку с информацией о товаре

    public String toString() {
        return
                "Название: " + name +
                ", Дата выхода: " + releaseDate +
                ", Производитель: " + manufacturer +
                ", Страна производства: " + countryOfOrigin +
                ", Цена: " + price +
                ", Доступность: " + (availableInStock ? "Есть в наличии" : "Нет в наличии");
    }

    // Геттеры для свойств (если потребуется доступ извне)
    public String getName() { return name; }
    public String getReleaseDate() { return releaseDate; }
    public String getManufacturer() { return manufacturer; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public double getPrice() { return price; }
    public boolean isAvailableInStock() { return availableInStock; }
}
