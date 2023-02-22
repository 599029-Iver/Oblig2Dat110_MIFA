package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker

    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic=topic;
    }

    private String topic;

    @Override
    public MessageType getType() {
        return super.getType();
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String getUser() {
        return super.getUser();
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    @Override
    public String toString() {
        return super.toString() + "DeleteTopicMsg{" +
                "topic='" + topic + '\'' +
                '}';
    }

}
