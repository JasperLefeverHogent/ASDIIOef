package channel;

import domein.Channel;
import domein.ChannelCollection;
import domein.ChannelCollectionImpl;
import domein.ChannelType;

public class ChannelTestDrive {

     public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
       System.out.println("Alle channels");
   
        System.out.println("De engelse channels");
        // Channel Type Iterator
   
    }
 
    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelType.HINDI));
        channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.HINDI));
        channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.5, ChannelType.FRENCH));
        return channels;
    }
    
}
