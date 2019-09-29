//package knowledge.accumulation.springcloud.kafka;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Producer {
//
//    @Autowired
//    private KafkaTemplate<String,String> kafkaTemplate;
//
//    /**
//     * 发送消息到kafka
//     */
//    public void sendChannelMess(String channel, String message){
//        kafkaTemplate.send(channel,message);
//    }
//}
