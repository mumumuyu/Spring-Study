package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Hello {
    private String name;
//    @Autowired
//    @Qualifier(value = "Dog222")
    @Resource(name="dog2")
    private Dog dog;

    public Hello(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Your name is" + name);
    }

    public Hello(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public Hello() {
    }
}
