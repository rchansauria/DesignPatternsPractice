package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonExampleTest {

    @Test
    public void shouldCreateOnlyOneInstance() {
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = SingletonExample.getInstance();
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonThreadSafety() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        Set<SingletonExample> instances = ConcurrentHashMap.newKeySet();
        Callable<Void> task = () -> {
            instances.add(SingletonExample.getInstance());
            return null;
        };

        executorService.submit(task);
        assertNotNull(instances);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        assertSame(1, instances.size());

    }

}