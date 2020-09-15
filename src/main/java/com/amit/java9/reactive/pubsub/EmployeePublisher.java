package com.amit.java9.reactive.pubsub;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class EmployeePublisher {

    public static void main(String[] args) {
        Stream<Employee> stream =Stream.of(new Employee("Amit", 1), new Employee("Rohit", 2), new Employee("Akshay", 3),
                new Employee("Arindam", 4), new Employee("Aakash", 5));

        EmployeeSubscriber subscriber = new EmployeeSubscriber();

        SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();
        publisher.subscribe(subscriber);

        stream.forEach(i -> {publisher.submit(i);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
