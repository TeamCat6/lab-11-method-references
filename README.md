# Лабораторна робота №11
## Тема:
## Виконав(-ли): Макасєєва Марія Олексіївна, Горлач Дарʼя Дмитрівна, Соколова Поліна Сергіївна
---
### **Хід роботи:**
Використовуючи класи лабораторної роботи №8 першого семестру демонструємо використання посилань на методи (Method reference)чотирьох типів.

Перший це посилання на статичний метод класу. Звертаємось на пряму до класу FoodProduct, у якого використовуємо посилання на метод printCount, який є статичний, не приймає жодних параметрів і нічого не повертаємо, і отримуємо функціональний інтерфейс Runnable, у якого викликаємо метод run.

Другий це посилання на не статичний метод об'єкту. Створюємо об'єкт FoodProduct, у якого використовуємо посилання на метод toString, який є не статичним, не приймає жодних параметрів і повертає String, і отримуємо функціональний інтерфейс Supplier, типізований під String, у якого викликаємо метод get і отримуємо значення типу String.

Третій це посилання на нестатичний метод класу. Звертаємось на пряму до класу FoodProduct, у якого використовуємо посилання на метод getFoodType, який є не статичний, не приймає жодних параметрів і повертає FoodType, і отримуємо функціональний інтерфейс Function типізований під два типи це FoodProduct і FoodType, і викликаємо метод apply, параметром якого є об'єкт FoodProduct і отримуємо значення типу FoodType.

Четвертий це посилання на конструктор. Зробили два варіанти: без параметрів і з параметрами.
Без параметрів, звертаємось до класу FoodProduct у якого використовуємо посилання на оператор new і отримуємо функціональний інтерфейс Supplier, типізований під FoodProduct, і викликаємо метод get і отримуємо об'єкт типу FoodProduct.
З параметрами, для цього створюємо функціональний інтерфейс ProductFoodFactory із методом create, який має параметри такі самі, як і в конструкторі із параметрами в класі FoodProduct. Звертаємо до класу FoodProduct у якого використовуємо посилання на оператор new і отримуємо функціональний інтерфейс ProductFoodFactory із методом create, в який передаємо необхідні параметри і отримуємо об'єкт FoodProduct.

### **Висновки:** 
Після того як ми вивчили лямбда-вирази і функціональні інтерфейси, ми можемо викликати методи за допомогою компактного синтаксису, який називається method-reference (посилання на метод). Якщо лямбда вирази звʼязуються з функціональним інтерфейсом, то методи так само можуть бути звʼязані з функціональним інтерфейсом. Звʼязок методу з функціональним інтерфейсом здійснюється за допомогою посилання на метод. Якщо лямбда-вираз може бути переданий в деякий метод як параметр, то посилання на метод також може бути передане як параметр. За допомогою цього посилання можна звертатися до методу, не викликаючи його.  
```
