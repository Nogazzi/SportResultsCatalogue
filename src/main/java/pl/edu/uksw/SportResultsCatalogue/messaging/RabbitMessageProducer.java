package pl.edu.uksw.SportResultsCatalogue.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.edu.uksw.SportResultsCatalogue.model.entity.RegistrationInfoDTO;

import java.util.logging.Logger;

@Component
public class RabbitMessageProducer {

    static Logger log = Logger.getLogger(RabbitMessageProducer.class.getName());

    public final static String PERSON_REGISTRATION_CONFIRM_QUEUE = "person-registration-confirm-queue";

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public void sendRegistrationConfirm(RegistrationInfoDTO registrationInfoDTO){
        amqpTemplate.convertAndSend(exchange, routingkey, registrationInfoDTO);
        System.out.println("Send msg = " + registrationInfoDTO);
    }
}
