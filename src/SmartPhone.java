/* Создать класс Smartphone, в котором должны быть параметры телеофна (например: производитель, тип, цвет)
   Создать классы любых смартфонов и унаследовать(extends) их от Smartphone
   У каждого наследника должны быть свои уникальные параметры (например: android / ios, планшет)
   Также у всех классов-наследников сделайте методы которые будут выводить в консоль их параметры.
   Создайте MainSmartphone класс, в котором создайте с параметрами унаследованными от Smartphone и их собственными параметрами.
   Вызовите у каждого наследника их методы.*/

public class SmartPhone {
    public static void main(String[] args) {
        honor p = new honor();
        Iphone i3 = new Iphone();
        p.setModel("redmi i10");
        p.setCompanyName("Huawei");
        p.setOs("Android");
        i3.setModel("number 23");
        i3.setCompanyName("apple");
        i3.setOs("ios");
        p.powerUp();
        i3.powerUp();
        i3.die(i3.getCompanyName());
        p.die(p.getCompanyName());
        p.Showstatus();
        i3.Showstatus();
    }
}