package com.amit.java9.reactive.pubsub;

import java.util.concurrent.Flow;

public class EmployeeSubscriber implements Flow.Subscriber<Employee> {

    private Flow.Subscription subscription;

    private  int counter = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        System.out.println("Started subscription of employees");
        this.subscription.request(1);
    }

    @Override
    public void onNext(Employee item) {
        System.out.println("Got item from publisher : " + item);
        counter++;
        this.subscription.request(2);

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error in getting messages" + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Done with processing of messages");
    }
}
