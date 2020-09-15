package com.amit.java9.reactive.processor;

import java.util.concurrent.Flow;

public class FreeLancerSubscriber implements Flow.Subscriber<FreeLancer> {

    private Flow.Subscription subscription;

    private  int counter = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        System.out.println("Started subscription of freelancer");
        this.subscription.request(1);
    }

    @Override
    public void onNext(FreeLancer item) {
        System.out.println("Got freelancer from publisher : " + item);
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
