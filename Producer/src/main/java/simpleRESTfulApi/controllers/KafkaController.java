package simpleRESTfulApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simpleRESTfulApi.kafka.KafkaProducer;
import simpleRESTfulApi.services.ClientService;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;
    private final ClientService clientService;

    public KafkaController(KafkaProducer kafkaProducer, ClientService clientService) {
        this.kafkaProducer = kafkaProducer;
        this.clientService = clientService;
    }

    @PostMapping("/kafka/send")
    public HttpStatus sendClient(@RequestParam int id) {
        kafkaProducer.sendMessage(clientService.read(id).toString());
        return HttpStatus.OK;
    }
}
