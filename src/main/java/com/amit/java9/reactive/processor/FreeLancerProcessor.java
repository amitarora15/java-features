package com.amit.java9.reactive.processor;

import com.amit.java9.reactive.pubsub.Employee;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class FreeLancerProcessor extends SubmissionPublisher<FreeLancer> implements Flow.Processor<Employee, FreeLancer> {

    private Flow.Subscription subscription;
    private Function<Employee, FreeLancer> function;

    public FreeLancerProcessor(Function<Employee, FreeLancer> function) {
        super();
        this.function = function;
    }


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Processor started registration to publisher");
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Employee item) {
        System.out.println("Processor getting Employee "+ item);
        this.submit((FreeLancer) function.apply(item));
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Got error in processor");
    }

    @Override
    public void onComplete() {
        System.out.println("Processor completed");
    }
}
