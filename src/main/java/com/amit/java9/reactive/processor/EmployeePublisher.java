package com.amit.java9.reactive.processor;

import com.amit.java9.reactive.pubsub.Employee;
import com.amit.java9.reactive.pubsub.EmployeeSubscriber;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class EmployeePublisher {

    public static void main(String[] args) {

        FreeLancerSubscriber freeLancerSubscriber = new FreeLancerSubscriber();

        SubmissionPublisher<Employee> employeeSubmissionPublisher = new SubmissionPublisher<>();

        FreeLancerProcessor freeLancerProcessor = new FreeLancerProcessor(s -> {
            return new FreeLancer(s.getName(), s.getAge(), s.getAge() + 10);
        });

        employeeSubmissionPublisher.subscribe(freeLancerProcessor);
        freeLancerProcessor.subscribe(freeLancerSubscriber);

        Stream<Employee> stream =Stream.of(new Employee("Amit", 1), new Employee("Rohit", 2), new Employee("Akshay", 3),
                new Employee("Arindam", 4), new Employee("Aakash", 5));


        stream.forEach(i -> {employeeSubmissionPublisher.submit(i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
