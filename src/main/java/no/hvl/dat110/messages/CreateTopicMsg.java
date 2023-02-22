package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker

    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
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
        return super.toString() + "CreateTopicMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
