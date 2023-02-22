package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
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
        return "UnsubscribeMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }
	
}
