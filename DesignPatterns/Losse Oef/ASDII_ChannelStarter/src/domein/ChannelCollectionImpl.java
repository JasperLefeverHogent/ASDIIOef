package domein;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

}
