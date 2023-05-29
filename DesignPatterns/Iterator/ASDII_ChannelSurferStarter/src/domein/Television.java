package domein;

public class Television {

    private Iterator iterator;
    
    public Television(int maxChannel) {
        iterator = new ChannelIterator(maxChannel);
    }

    public Program getNextProgram() {
    	return iterator.nextChannel().getCurrentProgram();
    }

    public Program getPrevProgram() {
    	return iterator.prevChannel().getCurrentProgram();
    }

}
