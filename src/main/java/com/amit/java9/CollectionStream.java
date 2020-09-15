package com.amit.java9;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum STATUS {OPEN, CLOSED};

@Data
@RequiredArgsConstructor
class Task {

    @NonNull private STATUS status;

    @NonNull private Integer points;

}

public class CollectionStream {

    public static void main(String[] args) {

        List<Task> tasks = Arrays.asList(new Task(STATUS.OPEN, 20), new Task(STATUS.OPEN, 40), new Task(STATUS.CLOSED, 40));

        System.out.println("Task sum : " + tasks.stream().filter(t -> t.getStatus() == STATUS.OPEN).mapToInt(Task::getPoints).sum());
        Map<STATUS, List<Task>> maps = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
        System.out.println("Grouped Map : " + maps);

        System.out.println("Parallel sum : " + tasks.stream().parallel().mapToInt(Task::getPoints).reduce(0, Integer::sum));
    }

}
