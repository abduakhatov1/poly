package com.example.demo2;
import com.example.demo2.entity.Client;
import com.example.demo2.repo.ClientRepository;
import com.example.demo2.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication



public class Demo2Application2 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application2.class, args);
    }
    @Autowired
    private ClientRepository clientRepository;
    private StudentRepository studentRepository;

    @Override
    public void run (String... args) throws Exception{

       /* Student student1 = new Student("Эльдар", "Керимов", "eldar1292@mail.ru");
        studentRepository.save(student1);

        Student student2 = new Student("Абдуахатов", "Голиб", "golib@mail.ru");
        studentRepository.save(student2);*/
    }



}
