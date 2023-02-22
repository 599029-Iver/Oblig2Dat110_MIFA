package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {
        super((MessageType.SUBSCRIBE, user));
        this.topic=topic;
    }

    private String topic;

    @Override
    public MessageType getType() {
        return super.getType();
    }

    @Override
    public String getUser() {
        return super.getUser();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }
		
}
