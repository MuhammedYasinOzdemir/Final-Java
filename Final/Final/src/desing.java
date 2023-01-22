public class desing {
    /*
    Java'da tasarım kalıpları, yazılım projelerinde sıkça kullanılan ve problemleri çözmek için kullanılan yapılardır.
     Örneğler arasında Singleton, Observer, Factory gibi kalıplar vardır.
     Bunlar, kodun okunabilirliğini ve bakımını kolaylaştırmak için kullanılır.
      Örneğin, Singleton kalıbı, sadece bir nesnenin uygulamada birden fazla yerde oluşmasını engellemek için kullanılır.
       Observer kalıbı ise, nesneler arasındaki etkileşimi ve senkronizasyonu sağlamak için kullanılır.
        Factory kalıbı ise, nesnelerin oluşturulması için kullanılır ve kodun okunabilirliğini ve bakımını kolaylaştırır.
     */
    /*Singleton tasarım kalıbı, sadece bir nesnenin uygulamada birden fazla yerde oluşmasını engellemek için kullanılır.
     Örneğin, bir uygulamada sadece bir veritabanı bağlantısının oluşması gerektiğini düşünelim.
      Bu durumda, veritabanı bağlantısının nesnesi Singleton tasarım kalıbını kullanarak oluşturulabilir
       Aşağıdaki örnekte görüldüğü gibi, Singleton nesnesi sadece ilk oluşturulduğunda yaratılır ve daha sonraki isteklerde aynı nesne döndürülür:
     */
    /*public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }*/
    /*Singleton tasarım kalıbı, sadece bir nesnenin uygulamada birden fazla yerde oluşmasını engellemek için kullanılır. Örneğin, bir uygulamada sadece bir veritabanı bağlantısının oluşması gerektiğini düşünelim. Bu durumda, veritabanı bağlantısının nesnesi Singleton tasarım kalıbını kullanarak oluşturulabilir. Aşağıdaki örnekte görüldüğü gibi, Singleton nesnesi sadece ilk oluşturulduğunda yaratılır ve daha sonraki isteklerde aynı nesne döndürülür:

Copy code
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
Observer tasarım kalıbı, nesneler arasındaki etkileşimi ve senkronizasyonu sağlamak için kullanılır.
 Örneğin, bir uygulamada bir güncelleme yapıldığında diğer tüm nesnelerin bunu bilmesi gerektiğini düşünelim.
  Bu durumda, güncelleme yapılan nesne Observer tasarım kalıbını kullanarak diğer nesneleri bilgilendirebilir.
   Aşağıdaki örnekte görüldüğü gibi, Subject nesnesi bir güncelleme yaptığında Observer nesnelerine bildirim gönderir:
   public interface Observer {
    void update(String message);
}

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(String message){
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
Factory tasarım kalıbı ise, nesnelerin oluşturulması için kullanılır ve kodun okunabilirliğini ve bakımını kolaylaştırır.
Örneğin, bir uygulamada birden fazla nesne tipi oluşturulduğunu düşünelim.
 Bu durumda, nesnelerin oluşturulması için Factory tasarım kalıbını
 Decorator tasarım kalıbı, nesnelerin özelliklerini dinamik olarak değiştirmek için kullanılır.
 Örneğin, bir uygulamada bir nesnenin özellikleri aşağıdaki gibi sürekli değiştirilebilir
 public abstract class Shape {
    public abstract void draw();
}

public class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
Adapter tasarım kalıbı, farklı sınıflar arasındaki uyumsuzluğu çözmek için kullanılır.
 Örneğin, bir uygulamada yeni bir sınıf eklenir ve eski sınıfla uyumlu olmaması durumunda kullanılabilir:
 public interface NewElectricitySystem {
    String matchWideSocket();
}

public class UKElectricitySystem implements NewElectricitySystem {
    public String matchWideSocket(){
        return "220V";
    }
}

public interface OldElectricitySystem {
    String matchThinSocket();
}

public class IndiaElectricitySystem implements OldElectricitySystem {
    public String matchThinSocket(){
        return "240V";
    }
}

public class ElectricityAdapter implements OldElectricitySystem {
    NewElectricitySystem newElectricitySystem;
    public ElectricityAdapter(NewElectricitySystem newElectricitySystem) {
        this.newElectricitySystem = newElectricitySystem;
    }
    public String matchThinSocket() {
        return newElectricitySystem.matchWideSocket();
    }
}
Command tasarım kalıbı, nesneler arasındaki etkileşimi ve senkronizasyonu sağlamak için kullanılır.
 Örneğin, bir uygulamada bir nesnenin çeşitli işlemleri yapması gerektiğini düşünelim:
 interface Command {
    void execute();
}

class Light {
    public void turnOn(){
        System.out.println("The light is on");
    }
    public void turnOff(){
        System.out.println("The light is off");
    }
}

class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.turnOff();
    }
}
Bu örnekte, LightOnCommand ve LightOffCommand nesneleri Light nesnesinin çeşitli işlemlerini yapması için kullanılır. Bu sayede, nesneler arasındaki etkileşim daha organize hale getirilmiş olur.

Bu sadece birkaç örnekti, Java'da tasarım kalıplarının çok daha fazlası var. Her bir kalıp kendi uygulama alanlarına ve problemlerine özgüdür ve hangisini kullanacağınız projenizin ihtiyacına göre değişebilir.
     */
}


