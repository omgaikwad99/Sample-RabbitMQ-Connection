package org.example;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserMessageListener {

    @RabbitListener(queues = "user-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message from contacts app: " + message);
    }

}