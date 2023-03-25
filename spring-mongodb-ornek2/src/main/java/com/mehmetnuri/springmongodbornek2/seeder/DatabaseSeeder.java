package com.mehmetnuri.springmongodbornek2.seeder;

import com.github.javafaker.Faker;
import com.mehmetnuri.springmongodbornek2.document.Certificate;
import com.mehmetnuri.springmongodbornek2.document.Student;
import com.mehmetnuri.springmongodbornek2.enums.EnumStatusAP;
import com.mehmetnuri.springmongodbornek2.service.CertificateService;
import com.mehmetnuri.springmongodbornek2.service.StudentService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Component
public class DatabaseSeeder implements ApplicationListener<ContextRefreshedEvent> {

    private Faker faker;

    private final StudentService studentService;
    private final CertificateService certificateService;

    public DatabaseSeeder(StudentService studentService, CertificateService certificateService) {
        this.certificateService = certificateService;
        this.faker = new Faker(Locale.ENGLISH);
        this.studentService = studentService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        studentInitilation();
//        certificateInit();

//        demoIliski();
    }

    private void demoIliski() {

        Certificate certificate = certificateService.findCertificateById("641f07e24fc60408939b1299");
        Student student = studentService.getStudentById("641f04598e67fd47d0904ca2");

        Set<Certificate> certificateSet =  new HashSet<>();
        certificateSet.add(certificate);
        student.setCertificates(certificateSet);
        studentService.saveStudent(student);

    }

    private void certificateInit() {
        for (int i = 0; i < 20; i++) {
            Certificate certificate = new Certificate();
            certificate.setTitle(faker.book().title());
            this.certificateService.saveCertificate(certificate);
        }
    }

    private void studentInitilation() {
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.setName(faker.name().firstName());
            student.setLastName(faker.name().lastName());
            student.setStatus(EnumStatusAP.ACTIVE);
            this.studentService.saveStudent(student);
        }

    }
}
